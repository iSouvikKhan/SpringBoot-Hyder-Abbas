package com.telusko.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Student;

@RestController
public class StudentController
{

	@GetMapping("/stu-info")
	public ResponseEntity<Student> getStudentInfo()
	{
		Student stu=new Student(1, "Kishore", "Chennai", 31);
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
	}
	
	@GetMapping("/stu-info2")
	public Student getStudentInfo2()
	{
		Student stu=new Student(1, "Kishore", "Chennai", 31);
		return stu;
	}
	
	@PostMapping("/add-stu")
	public ResponseEntity<String> addStudentInfo(@RequestBody Student stu)
	{
		String res="Student added successfully";
		System.out.println(stu);
		return new ResponseEntity<String>(res, HttpStatus.CREATED);
	}
	
	
}
