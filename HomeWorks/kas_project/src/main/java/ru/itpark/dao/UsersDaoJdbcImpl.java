package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoJdbcImpl implements UsersDao {

    private NamedParameterJdbcTemplate template;

    //language=SQL
    private final String SQL_INSERT_USER = "INSERT INTO clients(name, phone) VALUES(:name, :phone)";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID = "SELECT * FROM clients WHERE id = :id";

    //language=SQL
    private final String SQL_DELETE_USER_BY_ID = "DELETE FROM clients WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL = "SELECT * FROM clients";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_ID = "UPDATE clients SET name = :phone, phone = :phone WHERE id = :id";



    public UsersDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(User number) {
        // собрали значения именнованных параметров
        MapSqlParameterSource params = new MapSqlParameterSource();
       // params.addValue("id", number.getOwner_id());
        params.addValue("name", number.getName());
        params.addValue("phone", number.getPhone());

        String interestingKeys[] = {"id"};

        // держатель сгенерированного ключа вставленной строки
        KeyHolder holder = new GeneratedKeyHolder();
        template.update(SQL_INSERT_USER, params, holder, interestingKeys);
        Number generatedId = holder.getKey();
        return generatedId.intValue();
    }

    // анонимный класс
    // реализуем интерфейс "на месте"
    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");

            return new User(id, name, phone);
        }
    };

    public User find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_USER_BY_ID, params, userRowMapper);
    }

    public void update(User number) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", number.getId());
        params.put("name", number.getName());
        params.put("phone", number.getPhone());
        template.update(SQL_USER_UPDATE_BY_ID, params);
    }

    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_USER_BY_ID, params);
    }

    public List<User> findAll() {
        return null;
    }


    public List<User> findAll(int owner_id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("owner_id", owner_id);
        return template.query(SQL_SELECT_ALL, userRowMapper);

    }
}
