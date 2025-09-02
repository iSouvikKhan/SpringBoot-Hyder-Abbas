package com.telusko.SecurityApp1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SecurityApp1.UserService;
import com.telusko.SecurityApp1.model.Alien;
import com.telusko.SecurityApp1.model.Users;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TeluskoController 
{
	@Autowired
	private UserService service;
	
	BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(12);

	@GetMapping("/info")
	public ResponseEntity<String> getInfo(HttpServletRequest request)
	{
		String info="Telusko Might Launch GenAI soon" + request.getSession().getId();
		return new ResponseEntity<String>(info, HttpStatus.OK);
	}
	
	@GetMapping("/more-info")
	public ResponseEntity<String> getMoreInfo(HttpServletRequest request)
	{
		String info="Telusko Might Launch SpringAI" + request.getSession().getId();
		return new ResponseEntity<String>(info, HttpStatus.OK);
	}
	
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> addResource(@RequestBody Alien alien )
	{
		
		return new ResponseEntity<Alien>(alien, HttpStatus.OK);
	}
	
	
	@PostMapping("/add-user")
	public ResponseEntity<Users> addUser(@RequestBody Users user)
	{
		
		String encodedPassword=bcrypt.encode(user.getPassword());
		user.setPassword(encodedPassword);
	    Users userDB = service.register(user);
		
		return new ResponseEntity<Users>(userDB, HttpStatus.OK);
	}
}
