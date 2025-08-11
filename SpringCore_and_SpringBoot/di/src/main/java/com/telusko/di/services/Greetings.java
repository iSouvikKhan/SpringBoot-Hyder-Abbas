package com.telusko.di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Greetings implements IGreetings {

    @Autowired
    private LocalTime time;

    public Greetings(){
        System.out.println("Greetings bean created");
    }

    @Override
    public String generateGreetings(String name) {
        int hour = time.getHour();
        if(hour < 12) return "Good morning " + name;
        else if(hour < 16) return "Good afternoon " + name;
        else if(hour < 20) return "Good evening " + name;
        else return "Good night " + name;
    }
}
