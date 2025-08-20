package com.telusko.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Alien;
import com.telusko.service.IAlienService;

@RestController
public class AlienController 
{
	@Autowired
	private IAlienService service;
	
	@PostMapping("/add-alien")
	public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien)
	{
		Alien al=service.registerAlien(alien);
		return new ResponseEntity<Alien>(al, HttpStatus.CREATED);
	}
	
	@GetMapping("/get-aliens")
	public ResponseEntity<List> getAlien()
	{
		List<Alien> aliens=service.getAllAliensInfo();
		return new ResponseEntity<List>(aliens, HttpStatus.OK);
	}

}
