package ru.itpark.services;

import ru.itpark.models.Credits;
import ru.itpark.models.User;

import java.util.List;

public interface UsersService {
    List<User> getUsersByPhone(int phone);

    User getUserWithCredits(int userId);
    int addCreditsToUser(int userId, Credits credits);
}
