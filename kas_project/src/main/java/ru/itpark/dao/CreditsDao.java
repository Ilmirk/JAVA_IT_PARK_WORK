package ru.itpark.dao;

import ru.itpark.models.Credits;

import java.util.List;

public interface CreditsDao extends BaseCrudDao<Credits> {
    List<Credits> findAllCredits(int owner_id);
}