package com.airport.airlines.airports;

import com.airport.airlines.airline.Airline;

public class Airport {


    private Airline[] airlines=new Airline[19];
    int index;


    public boolean addAirlines(Airline airline){
        boolean isAdded=false;

        boolean isAirlineidValid=false;
        boolean isAirlineNameValid=false;
        boolean isAirlineCodeValid=false;
        boolean isTerminalValid=false;
        boolean isCountryValid=false;
        boolean isDestinationsValid=false;


        int airlineId=airline.getAirlineId();
        if(airlineId>0){
            isAirlineidValid=true;
        }else System.out.println("Invalid airlineId");

        String airlineName=airline.getAirlineName();
        if(airlineName!=null && !airlineName.isEmpty()){
            isAirlineNameValid=true;
        }else System.out.println("INvalid airlineName");

        String airlineCode= airline.getAirlineCode();
        if(airlineCode!=null && !airlineCode.isEmpty()){
            isAirlineCodeValid=true;
        }else System.out.println("Invalid aielineCode");

        String terminal=airline.getTerminal();
        if(terminal!=null && !terminal.isEmpty()){
            isTerminalValid=true;
        }else System.out.println("Invalid terminal");

        String country=airline.getCountry();
        if(country!=null && !country.isEmpty()){
            isCountryValid=true;
        }else System.out.println("Invalid country");

        String[] destinations=airline.getDestinations();
        if(destinations!=null && destinations.length>0){
            isDestinationsValid=true;
        }else System.out.println("invalid destinations");

        if(isAirlineidValid && isAirlineNameValid && isAirlineCodeValid
        && isTerminalValid && isCountryValid && isDestinationsValid){
            airlines[index++]=airline;
            isAdded=true;
        }
        return isAdded;
    }
    public void getAirlinesInfo(){
        for (Airline airline:airlines){
            System.out.println(airline);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
