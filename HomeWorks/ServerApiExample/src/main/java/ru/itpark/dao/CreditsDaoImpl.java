package ru.itpark.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.models.Credits;

import java.util.List;

@Component
public class CreditsDaoImpl implements CreditsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int saveForUser(int userId, Credits credits) {
        credits.setOwnerId(userId);
        Session session = getSession();
        session.beginTransaction();
        int generatedId = (Integer)session.save("credits", credits);
        session.getTransaction().commit();
        return generatedId;
    }

    @Override
    public int save(Credits number) {
        return 0;
    }

    @Override
    public Credits find(int id) {
        return null;
    }

    @Override
    public void update(Credits number) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Credits> findAll() {
        return null;
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
}
