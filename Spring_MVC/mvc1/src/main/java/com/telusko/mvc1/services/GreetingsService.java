package com.telusko.mvc1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingsService implements IGreetings{

    @Autowired
    private LocalTime time;

    @Override
    public String GenerateGreeting() {
        int hour = time.getHour();
        if(hour < 12) return "Good morning";
        else if(hour < 16) return "Good afternoon";
        else if(hour < 20) return "Good evening";
        else return "Good night";
    }
}
