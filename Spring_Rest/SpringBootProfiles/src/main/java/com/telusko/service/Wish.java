package com.telusko.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile({"wish", "w"})
public class Wish implements IGreetingService {

	@Autowired
	private LocalTime time;
	
	public Wish()
	{
		System.out.println("Wish bean created");
	}
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
