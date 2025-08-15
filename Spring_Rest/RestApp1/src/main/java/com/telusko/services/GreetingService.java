package com.telusko.services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService 
{

	@Autowired
	private LocalTime time;
	
	
	@Override
	public String generateGreeting() 
	{
		int hour=time.getHour();
		if(hour<12)
			return "Good Moring";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";

	}

}
