package com.telusko.mvc1.controllers;

import com.telusko.mvc1.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController
{
    @GetMapping("/register")
    public String getHomePage()
    {
        System.out.println("Controll in homepage");
        return "register";
    }

    @PostMapping("/register")
    public String registerEmployee(Model model, Employee employee)
    {
        System.out.println(employee);
        model.addAttribute("emp", employee);
        return "response";
    }

}