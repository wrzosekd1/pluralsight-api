package com.pluralsight.pluralsightAPI.controllers;

import com.pluralsight.pluralsightAPI.models.Course;
import com.pluralsight.pluralsightAPI.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getCourses() {
        return service.getCourses();
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course) {
        return service.updateCourse(course);
    }

    @DeleteMapping
    public ResponseEntity deleteCourse(@RequestParam("id") String id) {
        service.deleteCourse(id);
        HashMap<String,String> resp = new HashMap<>();
        resp.put("message", "Course is successfully deleted");
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
