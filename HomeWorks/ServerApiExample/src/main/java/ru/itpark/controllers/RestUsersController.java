package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.models.Credits;
import ru.itpark.models.User;
import ru.itpark.services.UsersService;

import java.util.List;

@RestController
public class RestUsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/users")
    public List<User> getFriends(@RequestParam("phone") int phone) {
        return service.getUsersByPhone(phone);
    }

    @GetMapping(value = "users/{user-id}", params = "select=with_clients")
    public User getUserWithCredits(@PathVariable("user-id") int userId) {
        return service.getUserWithCredits(userId);
    }

    @PostMapping(value = "users/{user-id}/clients")
    public Integer addCreditsToUser(@PathVariable("user-id") int userId,
                              @RequestBody Credits credits) {
        return service.addCreditsToUser(userId, credits);
    }

}
