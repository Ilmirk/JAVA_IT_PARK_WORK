package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.itpark.models.Credits;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditsDaoJdbcImpl implements CreditsDao {

    private NamedParameterJdbcTemplate template;

    //language=SQL
    private final String SQL_INSERT_USER = "INSERT INTO credits(number, owner_id) VALUES(:number, :id)";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID = "SELECT * FROM credits WHERE id = :id";

    //language=SQL
    private final String SQL_DELETE_CREDITS_BY_ID = "DELETE FROM credits WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL = "SELECT * FROM credits";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_CREDITS = "UPDATE credits SET name = :phone, phone = :phone WHERE id = :id";

    public CreditsDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(Credits number) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", number.getOwnerId());
        params.addValue("number", number.getNumber());
        template.update(SQL_INSERT_USER, params);
        return number.getNumber();
    }

    private RowMapper<Credits> userRowMapper = new RowMapper<Credits>() {
        public Credits mapRow(ResultSet resultSet, int i) throws SQLException {
          //  int id = resultSet.getInt("id");
            int number = resultSet.getInt("number");
            int ownerId = resultSet.getInt("owner_id");

            return new Credits(number, ownerId);
        }
    };

    public Credits find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_USER_BY_ID, params, userRowMapper);
    }

    public void update(Credits number) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", number.getOwnerId());
        params.put("number", number.getNumber());
        template.update(SQL_USER_UPDATE_BY_CREDITS, params);
    }

    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_CREDITS_BY_ID, params);
    }

    public List<User> findAll() {
        return null;
    }

    public List<Credits> findAllCredits(int owner_id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("owner_id", owner_id);
        return template.query(SQL_SELECT_ALL, params, userRowMapper);
    }
}
