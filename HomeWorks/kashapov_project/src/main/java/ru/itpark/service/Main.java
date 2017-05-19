package ru.itpark.service;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.List;

public class Main {
public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev");
        context.load("ru.itpark\\context.xml");
        context.refresh();
        UsersService usersService = context.getBean(UsersService.class);
        ru.itpark.models.User user = new ru.itpark.models.User("minimen", 177);
        usersService.register(user);
        ru.itpark.models.User mishaFromBd = usersService.getClientsPhone("92742548");
        System.out.println(mishaFromBd.getId() + " " + mishaFromBd.getName() + " " + mishaFromBd.getPhone());

        List<ru.itpark.models.User> users = usersService.getListOfUsers();
        System.out.println(users);
        usersService.removeClients(1);
        ru.itpark.models.User lena = new ru.itpark.models.User(20, "Lena", 927456123);
        usersService.update(lena);
        }
}
