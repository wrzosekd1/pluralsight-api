package com.pluralsight.pluralsightAPI.config;

import com.pluralsight.pluralsightAPI.models.Author;
import com.pluralsight.pluralsightAPI.models.Course;
import com.pluralsight.pluralsightAPI.repositories.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.pluralsight.pluralsightAPI.repositories")
@Configuration
public class MongoDbConfig {
}
