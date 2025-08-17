package com.telusko.TicketBookingWebApp.models;

import java.util.Date;

public class Passenger {
    private int pid;
    private String name;

    public Passenger() {
    }

    private String departure;
    private String arrival;
    private Date dateOfJourney;

    public void setPid(int pid) {
        this.pid = pid;
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

    public int getPid() {
        return pid;
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

    public Passenger(int pid, String name, String departure, String arrival, Date dateOfJourney) {
        this.pid = pid;
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfJourney = dateOfJourney;
    }
}
