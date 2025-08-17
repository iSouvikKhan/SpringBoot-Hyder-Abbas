package com.telusko.TicketBookingWebApp.services;

import com.telusko.TicketBookingWebApp.models.Passenger;
import com.telusko.TicketBookingWebApp.models.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService implements ITicketService {
    @Override
    public Integer registerPassenger(Passenger passenger) {
        // RestTemplate (Normal programming) or WebClient (Reactive programming)
        return 0;
    }

    @Override
    public Ticket generateTicket(Integer ticketNumber) {
        return null;
    }
}
