package com.pluralsight.pluralsightAPI.controllers;

import com.pluralsight.pluralsightAPI.models.User;
import com.pluralsight.pluralsightAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService service;

    //create user
    @PostMapping("/createUser")
    public User createUser(@Valid @RequestBody User user) {
        return service.createUser(user);
    }

    @PostMapping("/login")
    public User login(@Valid @RequestBody User user) {
        return service.login(user);
    }
}
