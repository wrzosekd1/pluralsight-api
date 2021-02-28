package com.pluralsight.pluralsightAPI.services;

import com.pluralsight.pluralsightAPI.models.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(String courseId);
}
