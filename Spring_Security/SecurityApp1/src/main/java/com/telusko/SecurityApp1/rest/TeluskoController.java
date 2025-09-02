package com.telusko.SecurityApp1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SecurityApp1.model.Alien;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TeluskoController 
{

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
	
	@GetMapping("/csrf")
	public CsrfToken getCSRF(HttpServletRequest request)
	{
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> addResource(@RequestBody Alien alien )
	{
		
		return new ResponseEntity<Alien>(alien, HttpStatus.OK);
	} 
}
