package com.telusko.hateoas.services;

import com.telusko.hateoas.models.Course;

import java.util.List;

public interface ICourseService {
    Course getCourseInfo();
    List<Course> getAllCoursesInfo();
}
