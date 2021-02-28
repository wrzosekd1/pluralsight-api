package com.pluralsight.pluralsightAPI.repositories;

import com.pluralsight.pluralsightAPI.models.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
