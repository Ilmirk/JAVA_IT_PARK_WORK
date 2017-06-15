package ru.itpark.service;

import ru.itpark.models.Credits;
import ru.itpark.models.User;

import java.util.List;

public interface CreditsService {



    Credits getCreditsById(int owner_Id);

    void register(Credits credits);

    void removeCredits(int credits);

    void update(Credits credits);

    List<Credits> getCredits(int owner_id);
}
