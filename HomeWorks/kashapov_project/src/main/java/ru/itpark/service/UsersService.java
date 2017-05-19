package ru.itpark.service;

import java.util.List;

public interface UsersService {
    boolean hasName(int userId, String name);
    void register(ru.itpark.models.User user);

    ru.itpark.models.User getClientsPhone(String clientsPhone);

    void removeClients(int id);

    void update(ru.itpark.models.User user);

    List<ru.itpark.models.User> getListOfUsers();

    void removeUser(int i);
}
