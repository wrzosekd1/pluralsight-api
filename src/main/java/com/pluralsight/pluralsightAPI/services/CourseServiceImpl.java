package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.Course;
import com.pluralsight.pluralsightAPI.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> getCourses() {
        return repository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return repository.insert(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public void deleteCourse(String courseId) {
        if(courseId == null) {
        } else {
            repository.deleteById(courseId);
        }
    }
}
