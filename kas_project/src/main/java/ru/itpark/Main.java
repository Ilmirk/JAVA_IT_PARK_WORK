package ru.itpark;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev");
        context.load("ru.itpark\\context.xml");
        context.refresh();
        UsersService usersService = context.getBean(UsersService.class);
        User user = new User("minimen", "951542555");
        usersService.register(user);
        User mishaFromBd = usersService.getUserById(6);
        System.out.println(mishaFromBd.getId() + " " + mishaFromBd.getName());

        List<User> users = usersService.getListOfUsers();
        System.out.println(users);
        usersService.removeUser(11);
        User lena = new User(7, "Lena", "951542512");
        usersService.update(lena);
    }
}
