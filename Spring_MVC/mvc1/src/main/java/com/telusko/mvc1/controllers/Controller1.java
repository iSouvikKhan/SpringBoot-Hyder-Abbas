package com.telusko.mvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public ModelAndView display()
    {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "hello! Welcome to our first app");
        mav.setViewName("index");
        return mav;
    }
}
