package com.telusko.mvc1.controllers;

import com.telusko.mvc1.services.IGreetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/greeting")
public class Greetings {

    @Autowired
    private IGreetings service;

//    @RequestMapping(value="/greet", method=RequestMethod.GET)
    @GetMapping("/greet2")
    public String GenerateWish(Model model)
    {
        model.addAttribute("wish", service.GenerateGreeting());
        return "greet"; // jsp page name
    }

    @GetMapping("/greet")
    public void GenerateWish2(Model model)
    {
        model.addAttribute("wish", service.GenerateGreeting());
        // in this case viewResolver will pick the view name from the mapping url
        // this feature does not work with class level mapping, remove class level mapping then execute
    }

}
