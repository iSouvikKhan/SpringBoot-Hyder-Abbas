package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Course;

@RestController
public class CourseController 
{
	
	@PostMapping(value="/add-course", consumes= {"application/xml", "application/json"})
	public ResponseEntity<String> addCourseInfo(@RequestBody Course course)
	{
		System.out.println(course);
		String msg="Course Info Added";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/get-course", produces= {"application/xml", "application/json"})
	public ResponseEntity<Course> getCourseInfo()
	{
		Course course=new Course(1, "DevOps with AWS", 55565.5);
		
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}

}
