package ru.itpark.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.io.BufferedOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UsersDaoJdbcImpl implements UsersDao {

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO credits(name, phone) VALUES(:name, :phone)";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID =
            "SELECT * FROM credits WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM credits";

    //language=SQL
    private final String SQL_DELETE_USER_BY_ID =
            "DELETE FROM credits WHERE id = :id";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_ID =
            "UPDATE credits SET name = :name, phone = :phone WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_USERS_BY_AGE =
            "SELECT * FROM credits WHERE phone = :phone";

    private NamedParameterJdbcTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public UsersDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(User model) {
        // собрали значения именнованных параметров
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", model.getName());
        params.addValue("phone", model.getPhone());

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
            int phone = resultSet.getInt("phone");

            return new User(id, name, phone);
        }
    };

    public User find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_USER_BY_ID, params, userRowMapper);
    }

    public void update(User model) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", model.getId());
        params.put("name", model.getName());
        params.put("phone", model.getPhone());
        template.update(SQL_USER_UPDATE_BY_ID, params);
    }

    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_USER_BY_ID, params);
    }

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public List<User> findAllByPhone(int phone) {
        Session session = getSession();
        session.beginTransaction();

        List<User> users = session.createQuery("from User user where user.phone = :phone", User.class)
                        .setParameter("phone", phone).list();
        session.getTransaction().commit();
        return users;
    }

    @Override
    public User findByIdWithCredits(int id) {
        Session session = getSession();
        session.beginTransaction();

        User user =
                session.createQuery("from User user where user.id = :id", User.class)
                        .setParameter("id", id).getSingleResult();
        session.getTransaction().commit();
        return user;
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;

        BufferedOutputStream
    }
}
