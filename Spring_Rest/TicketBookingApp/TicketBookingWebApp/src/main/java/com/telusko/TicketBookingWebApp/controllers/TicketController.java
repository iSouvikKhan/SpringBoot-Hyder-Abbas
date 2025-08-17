package com.telusko.TicketBookingWebApp.controllers;

import com.telusko.TicketBookingWebApp.models.Passenger;
import com.telusko.TicketBookingWebApp.models.Ticket;
import com.telusko.TicketBookingWebApp.services.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {

    @Autowired
    private ITicketService service;

    @GetMapping("/get-form")
    public String getForm(@ModelAttribute Passenger passenger, Model model) {
        return "index";
    }

    @GetMapping("/book-ticket")
    public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
        int ticketNumber = service.registerPassenger(passenger);
        model.addAttribute("ticketNumber", ticketNumber);
        return "index";
    }

    @GetMapping("/ticket-form")
    public String getTicketForm(@ModelAttribute Passenger passenger, Model model) {
        return "ticket-form";
    }

    @GetMapping("/get-form")
    public String getTicket(@RequestParam("ticketNumber") Integer ticketNumber, Model model) {
        Ticket ticket = service.generateTicket(ticketNumber);
        model.addAttribute("ticket", ticket);
        return "ticket-info";
    }
}
