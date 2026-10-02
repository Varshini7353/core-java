package com.book.bookservice.hotel;

public class Hotel {

    public int hotelId;
    public String hotelName;
    public String location;
    public String famousDish;
    public int noOfRooms;


    @Override
    public boolean equals(Object obj){

        Hotel hotel=(Hotel)obj;

        if(this.hotelId==hotel.hotelId &&
        this.hotelName.equals(hotel.hotelName) &&
        this.location.equals(hotel.location) &&
        this.famousDish.equals(hotel.famousDish) &&
        this.noOfRooms==hotel.noOfRooms){

            return true;
        }
        return false;
    }
}
