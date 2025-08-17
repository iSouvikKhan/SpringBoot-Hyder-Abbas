package com.telusko.hateoas.controllers;

import com.telusko.hateoas.models.Course;
import com.telusko.hateoas.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    ICourseService service;

    @GetMapping("course-info")
    public ResponseEntity<Course> getCourseInfo() {
        Course course = service.getCourseInfo();
        Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class).getAllCourseInfo()).withRel("Get all courses");
        course.add(link);
        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }

    @GetMapping("/all-courses-info")
    public ResponseEntity<List<Course>> getAllCourseInfo() {
        List<Course> list = service.getAllCoursesInfo();
        return new ResponseEntity<List<Course>>(list, HttpStatus.OK);
    }
}
