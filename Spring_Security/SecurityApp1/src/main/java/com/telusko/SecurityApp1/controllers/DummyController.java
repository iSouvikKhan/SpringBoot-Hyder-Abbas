package com.telusko.SecurityApp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("getname")
    public String getName(){
        return "Souvik Khan";
    }
}
