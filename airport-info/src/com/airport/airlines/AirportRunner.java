package com.airport.airlines;

import com.airport.airlines.airline.Airline;
import com.airport.airlines.airports.Airport;

public class AirportRunner {

    public static void main(String[] args) {

        Airport airport=new Airport();

        String[] destinations= {"Delhi", "Mumbai", "Chennai"};
        String[] destinations1 = {"Lucknow", "Jaipur", "Chennai"};
        String[] destinations2 = {"Dubai", "Abu Dhabi", "Doha"};
        String[] destinations3 = {"Hyderabad", "Kolkata", "Pune"};
        String[] destinations4 = {"Singapore", "Bangkok", "Kuala Lumpur"};
        String[] destinations5 = {"Goa", "Kochi", "Ahmedabad"};
        String[] destinations6 = {"London", "Paris", "Frankfurt"};
        String[] destinations7 = {"Delhi", "Jaipur", "Lucknow"};
        String[] destinations8 = {"Dubai", "Muscat", "Sharjah"};
        String[] destinations9 = {"Mumbai", "Pune", "Nagpur"};
        String[] destinations10 = {"Chennai", "Coimbatore", "Madurai"};
        String[] destinations11 = {"New York", "Chicago", "San Francisco"};
        String[] destinations12 = {"Colombo", "Maldives", "Kathmandu"};
        String[] destinations13 = {"Bengaluru", "Delhi", "Mumbai"};
        String[] destinations14 = {"Doha", "Dubai", "Riyadh"};
        String[] destinations15 = {"Kolkata", "Bhubaneswar", "Patna"};
        String[] destinations16 = {"Singapore", "Sydney", "Melbourne"};
        String[] destinations17 = {"Goa", "Mangalore", "Hubli"};
        String[] destinations18 = {"Paris", "Amsterdam", "Rome"};


        Airline airline=new Airline();
        airline.setAirlineId(1);
        airline.setAirlineName("Emirites");
        airline.setAirlineCode("9E");
        airline.setTerminal("Terminal");
        airline.setCountry("India");
        airline.setDestinations(destinations);

        Airline airline1 = new Airline();
        airline1.setAirlineId(2);
        airline1.setAirlineName("IndiGo");
        airline1.setAirlineCode("6E");
        airline1.setTerminal("Terminal 1");
        airline1.setCountry("India");
        airline1.setDestinations(destinations1);

        Airline airline2 = new Airline();
        airline2.setAirlineId(3);
        airline2.setAirlineName("Air India");
        airline2.setAirlineCode("AI");
        airline2.setTerminal("Terminal 2");
        airline2.setCountry("India");
        airline2.setDestinations(destinations2);

        Airline airline3 = new Airline();
        airline3.setAirlineId(4);
        airline3.setAirlineName("Air India Express");
        airline3.setAirlineCode("IX");
        airline3.setTerminal("Terminal 2");
        airline3.setCountry("India");
        airline3.setDestinations(destinations3);

        Airline airline4 = new Airline();
        airline4.setAirlineId(5);
        airline4.setAirlineName("Akasa Air");
        airline4.setAirlineCode("QP");
        airline4.setTerminal("Terminal 1");
        airline4.setCountry("India");
        airline4.setDestinations(destinations4);

        Airline airline5 = new Airline();
        airline5.setAirlineId(6);
        airline5.setAirlineName("Alliance Air");
        airline5.setAirlineCode("9I");
        airline5.setTerminal("Terminal 1");
        airline5.setCountry("India");
        airline5.setDestinations(destinations5);

        Airline airline6 = new Airline();
        airline6.setAirlineId(7);
        airline6.setAirlineName("Emirates");
        airline6.setAirlineCode("EK");
        airline6.setTerminal("Terminal 2");
        airline6.setCountry("UAE");
        airline6.setDestinations(destinations6);

        Airline airline7 = new Airline();
        airline7.setAirlineId(8);
        airline7.setAirlineName("Qatar Airways");
        airline7.setAirlineCode("QR");
        airline7.setTerminal("Terminal 2");
        airline7.setCountry("Qatar");
        airline7.setDestinations(destinations7);

        Airline airline8 = new Airline();
        airline8.setAirlineId(9);
        airline8.setAirlineName("Singapore Airlines");
        airline8.setAirlineCode("SQ");
        airline8.setTerminal("Terminal 2");
        airline8.setCountry("Singapore");
        airline8.setDestinations(destinations8);

        Airline airline9 = new Airline();
        airline9.setAirlineId(10);
        airline9.setAirlineName("British Airways");
        airline9.setAirlineCode("BA");
        airline9.setTerminal("Terminal 2");
        airline9.setCountry("United Kingdom");
        airline9.setDestinations(destinations9);

        Airline airline10 = new Airline();
        airline10.setAirlineId(11);
        airline10.setAirlineName("Lufthansa");
        airline10.setAirlineCode("LH");
        airline10.setTerminal("Terminal 2");
        airline10.setCountry("Germany");
        airline10.setDestinations(destinations10);

        Airline airline11 = new Airline();
        airline11.setAirlineId(12);
        airline11.setAirlineName("Etihad Airways");
        airline11.setAirlineCode("EY");
        airline11.setTerminal("Terminal 2");
        airline11.setCountry("UAE");
        airline11.setDestinations(destinations11);

        Airline airline12 = new Airline();
        airline12.setAirlineId(13);
        airline12.setAirlineName("SriLankan Airlines");
        airline12.setAirlineCode("UL");
        airline12.setTerminal("Terminal 2");
        airline12.setCountry("Sri Lanka");
        airline12.setDestinations(destinations12);

        Airline airline13 = new Airline();
        airline13.setAirlineId(14);
        airline13.setAirlineName("SpiceJet");
        airline13.setAirlineCode("SG");
        airline13.setTerminal("Terminal 1");
        airline13.setCountry("India");
        airline13.setDestinations(destinations13);

        Airline airline14 = new Airline();
        airline14.setAirlineId(15);
        airline14.setAirlineName("Oman Air");
        airline14.setAirlineCode("WY");
        airline14.setTerminal("Terminal 2");
        airline14.setCountry("Oman");
        airline14.setDestinations(destinations14);

        Airline airline15 = new Airline();
        airline15.setAirlineId(16);
        airline15.setAirlineName("Vistara");
        airline15.setAirlineCode("UK");
        airline15.setTerminal("Terminal 2");
        airline15.setCountry("India");
        airline15.setDestinations(destinations15);

        Airline airline16 = new Airline();
        airline16.setAirlineId(17);
        airline16.setAirlineName("Malaysia Airlines");
        airline16.setAirlineCode("MH");
        airline16.setTerminal("Terminal 2");
        airline16.setCountry("Malaysia");
        airline16.setDestinations(destinations16);

        Airline airline17 = new Airline();
        airline17.setAirlineId(18);
        airline17.setAirlineName("Go First");
        airline17.setAirlineCode("G8");
        airline17.setTerminal("Terminal 1");
        airline17.setCountry("India");
        airline17.setDestinations(destinations17);

        Airline airline18 = new Airline();
        airline18.setAirlineId(19);
        airline18.setAirlineName("Air France");
        airline18.setAirlineCode("AF");
        airline18.setTerminal("Terminal 2");
        airline18.setCountry("France");
        airline18.setDestinations(destinations18);




        airport.addAirlines(airline);
        airport.addAirlines(airline1);
        airport.addAirlines(airline2);
        airport.addAirlines(airline3);
        airport.addAirlines(airline4);
        airport.addAirlines(airline5);
        airport.addAirlines(airline6);
        airport.addAirlines(airline7);
        airport.addAirlines(airline8);
        airport.addAirlines(airline9);
        airport.addAirlines(airline10);
        airport.addAirlines(airline11);
        airport.addAirlines(airline12);
        airport.addAirlines(airline13);
        airport.addAirlines(airline14);
        airport.addAirlines(airline15);
        airport.addAirlines(airline16);
        airport.addAirlines(airline17);
        airport.addAirlines(airline18);

        airport.getAirlinesInfo();

    }
}
