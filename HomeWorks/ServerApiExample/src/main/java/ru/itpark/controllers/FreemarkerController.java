package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.models.User;
import ru.itpark.services.UsersService;

import java.util.List;

@Controller
public class FreemarkerController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/users/ftl")
    public String getUsers(@ModelAttribute("number")ModelMap model,
                           @RequestParam("phone") int phone) {
        List<User> users = usersService.getUsersByPhone(phone);
        model.addAttribute("users", users);
        return "users";
    }

}
