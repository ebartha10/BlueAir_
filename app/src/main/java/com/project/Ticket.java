package com.project;

import java.util.Date;

//TICKET CLASS THAT HOLDS INFORMATION ABOUT THE TICKET
public class Ticket {
    String ticket_depart;
    String ticket_arrival;
    String ticket_date_depart;
    String ticket_date_arrival;
    String ticket_company;
    String ticket_price;
    String ticket_person;
    String ticket_class;

    //===== NEEDED FOR SQL! ====//
    private int flightID;

    public int getFlightID() {
        return flightID;
    }
    //===== NEEDED FOR SQL! ====//
    public Ticket(String ticket_depart, String ticket_arrival, String ticket_date_depart, String ticket_date_arrival, String ticket_duration, String ticket_company, String ticket_price) {
        this.ticket_depart = ticket_depart;
        this.ticket_arrival = ticket_arrival;
        this.ticket_date_depart = ticket_date_depart;
        this.ticket_date_arrival = ticket_date_arrival;
        this.ticket_company = ticket_company;
        this.ticket_price = ticket_price;
    }
    public Ticket(String ticket_depart, String ticket_arrival, String ticket_date_depart, String ticket_date_arrival, String ticket_class, String ticket_company, String ticket_price, int idFlight, String ticket_person) {
        this.ticket_depart = ticket_depart;
        this.ticket_arrival = ticket_arrival;
        this.ticket_date_depart = ticket_date_depart;
        this.ticket_date_arrival = ticket_date_arrival;
        this.ticket_class = ticket_class;
        this.ticket_company = ticket_company;
        this.ticket_price = ticket_price;
        this.flightID = idFlight;
        this.ticket_person = ticket_person;
    }

    public String getTicket_depart() {
        return ticket_depart;
    }

    public void setTicket_depart(String ticket_depart) {
        this.ticket_depart = ticket_depart;
    }

    public String getTicket_arrival() {
        return ticket_arrival;
    }

    public void setTicket_arrival(String ticket_arrival) {
        this.ticket_arrival = ticket_arrival;
    }

    public String getTicket_date_depart() {
        return ticket_date_depart;
    }

    public void setTicket_date_depart(String ticket_date_depart) {
        this.ticket_date_depart = ticket_date_depart;
    }

    public String getTicket_date_arrival() {
        return ticket_date_arrival;
    }

    public void setTicket_date_arrival(String ticket_date_arrival) {
        this.ticket_date_arrival = ticket_date_arrival;
    }

    public String getTicket_company() {
        return ticket_company;
    }

    public void setTicket_company(String ticket_company) {
        this.ticket_company = ticket_company;
    }

    public String getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(String ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getTicket_person() {
        return ticket_person;
    }

    public String getTicket_class() {
        return ticket_class;
    }

    public void setTicket_person(String ticket_person) {
        this.ticket_person = ticket_person;
    }

    public void setTicket_class(String ticket_class) {
        this.ticket_class = ticket_class;
    }
}
