package com.telusko.controllers;

import com.telusko.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController = @Controller + @ResponseBody
public class GreetingRestController {
    @Autowired
    private IGreetingService service;

    @GetMapping("/greet3")
    public String getWish3()
    {
        String response=service.generateGreeting();
        return response;
    }

    @GetMapping("/greet4")
    public ResponseEntity<String> getWish4()
    {
        String response=service.generateGreeting();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
