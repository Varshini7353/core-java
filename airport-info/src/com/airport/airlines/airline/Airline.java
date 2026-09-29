package com.airport.airlines.airline;

import java.util.Arrays;

public class Airline {


    private int airlineId;
    private String airlineName;
    private String airlineCode;
    private String terminal;
    private String country;
    private String[] destinations;


    public int getAirlineId(){
        return airlineId;
    }

    public void setAirlineId(int airlineId){
        this.airlineId=airlineId;
    }

    public String getAirlineName(){
        return airlineName;
    }

    public void setAirlineName(String airlineName){
        this.airlineName=airlineName;
    }

    public String getAirlineCode(){
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode){
        this.airlineCode=airlineCode;
    }

    public String getTerminal(){
        return terminal;
    }

    public void setTerminal(String terminal){
        this.terminal=terminal;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }

    public String[] getDestinations(){
        return destinations;
    }

    public void setDestinations(String[] destinations){
        this.destinations =destinations;
    }

    @Override
    public String toString(){
        return "Airline(airlineId= "+this.airlineId+" , airlineName= "
                +this.airlineName+" , airlineCode= "+this.airlineCode+",terminal= "
                +this.terminal+" ,country= "
                +this.country+" , destinations= "+ Arrays.toString(this.destinations)+")";
    }
}
