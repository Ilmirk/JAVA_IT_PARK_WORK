package ru.itpark.service;

import ru.itpark.dao.CreditsDao;
import ru.itpark.models.Credits;

import java.util.List;

public class CreditsServiceImpl implements CreditsService {

    private CreditsDao creditsDao;

    public CreditsServiceImpl(CreditsDao creditsDao) {
        this.creditsDao = creditsDao;
    }

    public Credits getCreditsById(int owner_id) {
        return creditsDao.find(owner_id);
    }

    public void register(Credits credits) {
        System.out.println(creditsDao.save(credits));
    }

    public void removeCredits(int credits) {
        creditsDao.delete(credits);
    }

    public void update(Credits credits) {
        creditsDao.update(credits);
    }


    public List<Credits> getCredits(int owner_id) {
        return creditsDao.findAllCredits(owner_id);
    }
}
