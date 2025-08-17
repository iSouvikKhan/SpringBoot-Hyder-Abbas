package com.telusko.hateoas.services;

import com.telusko.hateoas.models.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements ICourseService{

    @Override
    public Course getCourseInfo() {
        return new Course(1, "DevOps", 7999.9);
    }

    @Override
    public List<Course> getAllCoursesInfo() {
        var c1 = new Course(1, "DevOps", 7999.9);
        var c2 = new Course(2, "Java", 6999.9);
        var c3 = new Course(3, "AWS", 4999.9);

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        return courses;
    }
}
