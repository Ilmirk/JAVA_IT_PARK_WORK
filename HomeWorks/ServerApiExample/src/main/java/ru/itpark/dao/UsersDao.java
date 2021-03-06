package ru.itpark.dao;

import ru.itpark.models.User;

import java.util.List;

public interface UsersDao extends BaseCrudDao<User> {
    List<User> findAllByPhone(int phone);
    User findByIdWithCredits(int id);
}
