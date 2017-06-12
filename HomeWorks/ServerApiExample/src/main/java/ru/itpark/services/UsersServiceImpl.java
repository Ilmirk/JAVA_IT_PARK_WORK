package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.dao.CreditsDao;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.Credits;
import ru.itpark.models.User;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private CreditsDao creditsDao;

    @Override
    public List<User> getUsersByPhone(int phone) {
        return usersDao.findAllByPhone(phone);
    }

    @Override
    public User getUserWithCredits(int userId) {
        return usersDao.findByIdWithCredits(userId);
    }

    @Override
    public int addCreditsToUser(int userId, Credits credits) {
        return creditsDao.saveForUser(userId, credits);
    }
}
