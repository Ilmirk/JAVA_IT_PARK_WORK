package ru.itpark.service;

import ru.itpark.dao.UsersDao;

public abstract class UsersServiceImpl implements UsersService {

    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }


    public boolean hasName(int userId, String name) {
        ru.itpark.models.User user = usersDao.find(userId);
        return user.getName().equals(name);
    }


    public void register(ru.itpark.models.User user) {
        usersDao.save(user);
    }
}
