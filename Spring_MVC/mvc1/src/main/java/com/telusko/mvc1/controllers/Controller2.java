package com.telusko.mvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller2 {

    // query param: //http://localhost:8484/queryparam/info?name=Rajesh&course=DevOps
    @GetMapping("/info")
    public String displayMessage(String name, String course, Model model)
    {
        System.out.println(name+ " is in Controller");
        String response="Hello! "+name+" Welcome to Telusko AI "+course+" Course";
        model.addAttribute("message", response);
        return "index2";
    }

    // http://localhost:8484/queryparam/info2?personname=Souvik&coursename=java
    @GetMapping("/info2")
    public String displayMessage2(@RequestParam("personname") String name, @RequestParam("coursename") String course, Model model)
    {
        System.out.println(name+ " is in Controller");
        String response="Hello! "+name+" Welcome to Telusko AI "+course+" Course";
        model.addAttribute("message", response);
        return "index2";
    }


    // path param: http://localhost:8484/queryparam/info3/Souvik/Java
    @GetMapping("/info3/{name}/{course}")
    public String displayMessage3(@PathVariable("name") String name, @PathVariable("course") String course, Model model)
    {
        System.out.println(name+ " is in Controller");
        String response="Hello! "+name+" Welcome to Telusko AI "+course+" Course";
        model.addAttribute("message", response);
        return "index2";
    }
}
