package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.IGreetingService;

//@Controller + @ResponseBody
@RestController
public class GreetingController 
{

	@Autowired
	private IGreetingService service;
	
	@GetMapping("/greet1")
	//@ResponseBody
	public String getWish1()
	{
		String response=service.generateGreeting();
		return response;
	}
	
	@GetMapping("/greet2")
	//@ResponseBody
	public ResponseEntity<String> getWish2()
	{
		String response=service.generateGreeting();
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
