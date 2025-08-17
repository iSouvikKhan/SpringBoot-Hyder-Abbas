package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Student;
import com.telusko.service.IGreetingService;


@RestController
public class GreetingController 
{

	@Autowired
	private IGreetingService service;
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> getWish()
	{
		String response=service.generateGreeting();
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PostMapping("/add-stu")
	public ResponseEntity<String> addStudentInfo(@RequestBody Student stu)
	{
		
		System.out.println(stu);
		Boolean status=service.addStudent(stu);
		if(status)
		{
			String res="Student data inserted";
			return new ResponseEntity<String>(res, HttpStatus.CREATED);

		}
		else
		{
			String res="Student data insertion error";	
			return new ResponseEntity<String>(res, HttpStatus.INTERNAL_SERVER_ERROR);

		}
			
	}
}
