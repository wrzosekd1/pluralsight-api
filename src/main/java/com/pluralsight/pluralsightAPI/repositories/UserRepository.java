package com.pluralsight.pluralsightAPI.repositories;

import com.pluralsight.pluralsightAPI.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String userName);
    User findByUserNameAndPassword(String userName, String password);
}
