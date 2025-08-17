package com.telusko.TicketBookingWebApp.models;

import java.util.Date;

public class Ticket {
    private Integer ticketNumber;
    private String status;
    private Double ticketPrice;
    private String name;

    public Ticket() {
    }

    private String departure;
    private String arrival;
    private Date dateOfJourney;

    public Ticket(Integer ticketNumber, String status, Double ticketPrice, String name, String departure, String arrival, Date dateOfJourney) {
        this.ticketNumber = ticketNumber;
        this.status = status;
        this.ticketPrice = ticketPrice;
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfJourney = dateOfJourney;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public String getStatus() {
        return status;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public String getName() {
        return name;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }
}
