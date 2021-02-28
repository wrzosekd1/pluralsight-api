package com.pluralsight.pluralsightAPI.repositories;

import com.pluralsight.pluralsightAPI.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
