package com.telusko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.services.IGreetingService;

@Controller
public class GreetingController 
{
	@Autowired
	private IGreetingService service;
	
	@GetMapping("/greet1")
	@ResponseBody // needed because it is a @Controller not a @RestController
	public String getWish1()
	{
		String response=service.generateGreeting();
		return response; // sending raw response works but it is not recommended
		// u r explicitly telling response contains body not jsp page
	}
	
	@GetMapping("/greet2")
	@ResponseBody
	public ResponseEntity<String> getWish2()
	{
		String response=service.generateGreeting();
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
