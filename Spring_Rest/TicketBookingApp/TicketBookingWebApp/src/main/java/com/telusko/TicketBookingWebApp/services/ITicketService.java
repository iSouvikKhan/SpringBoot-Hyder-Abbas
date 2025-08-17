package com.telusko.TicketBookingWebApp.services;

import com.telusko.TicketBookingWebApp.models.Passenger;
import com.telusko.TicketBookingWebApp.models.Ticket;

public interface ITicketService {
    Integer registerPassenger(Passenger passenger);
    Ticket generateTicket(Integer ticketNumber);
}
