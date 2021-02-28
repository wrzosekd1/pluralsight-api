package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.User;

public interface UserService {
    User createUser(User user);
    User login(User user);
}
