package com.book.bookservice.booking;

public class Ticket {

    public int ticketId;
    public String movieName;
    public double price;
    public int seatNumber;
    public String theatreName;


    @Override
    public boolean equals(Object obj){

        Ticket ticket=(Ticket)obj;

        if(this.ticketId==ticket.ticketId &&  this.movieName.equals(ticket.movieName)
                &&  this.price==ticket.price  && this.seatNumber==ticket.seatNumber
                && this.theatreName.equals(ticket.theatreName)){

            return true;

        }

        return false;
    }

}
