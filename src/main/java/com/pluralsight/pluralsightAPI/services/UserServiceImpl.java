package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.User;
import com.pluralsight.pluralsightAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.insert(user);
    }

    @Override
    public User login(User user) {
        return repository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
    }
}
