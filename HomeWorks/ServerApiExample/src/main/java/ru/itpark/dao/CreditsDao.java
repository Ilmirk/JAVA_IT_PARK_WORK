package ru.itpark.dao;

import ru.itpark.models.Credits;

public interface CreditsDao extends BaseCrudDao<Credits> {
    int saveForUser(int userId, Credits credits);
}
