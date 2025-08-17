package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeluskoService 
{

	@Autowired
	private ITouristService service;
	
	public TeluskoService()
	{
		System.out.println("Telusko service Bean created");
	}
	
	public String generateMessage()
	{
		service.fetchAllTouristInfo();
		return "verifying";
	}
}
