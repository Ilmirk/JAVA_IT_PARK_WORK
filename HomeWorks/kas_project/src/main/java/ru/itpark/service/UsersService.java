package ru.itpark.service;

import ru.itpark.models.User;

import java.util.List;

public interface UsersService {

    boolean hasName(int userId, String name, String userPhone);

    User getUserById(int userId);

    void register(User user);

    void removeUser(int id);

    void update(User user);

    List<User> getListOfUsers();
}
