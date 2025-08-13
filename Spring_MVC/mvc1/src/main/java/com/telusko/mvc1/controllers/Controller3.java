package com.telusko.mvc1.controllers;

import com.telusko.mvc1.models.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller3 {

    // http://localhost:8484/queryparam/course-info
    @GetMapping("course-info")
    public String getCourseInfo(Model model)
    {
        Course course = new Course(1, "Java SpringBoot", 1234.12);
        model.addAttribute("course", course);
        return "index3";
    }

    // http://localhost:8484/queryparam/books
    @GetMapping("books")
    public String getBooks(Model model)
    {
        String books[] = new String[] {"Java", "Spring Boot", "DevOps"};
        model.addAttribute("books", books);
        return "index4";
    }
}
