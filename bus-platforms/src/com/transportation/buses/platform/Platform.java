package com.transportation.buses.platform;

import java.util.Arrays;

public class Platform {

    private int platformId;
    private String platformName;
    private String busNumber;
    private String destination;
    private String departureTime;
    private String[] buses;


    public int getPlatformId(){
        return platformId;
    }

    public void setPlatformId(int platformId){
        this.platformId=platformId;
    }

    public String getPlatformName(){
        return platformName;
    }

    public void setPlatformName(String platformName){
        this.platformName=platformName;
    }

    public String getBusNumber(){
        return busNumber;
    }

    public void setBusNumber(String busNumber){
        this.busNumber=busNumber;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination=destination;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }

    public String[] getBuses(){
        return buses;
    }

    public void setBuses(String[] buses){
        this.buses=buses;
    }

    @Override
    public String toString(){
        return "Platform( platformId= "+this.platformId+", platformName= "
                +this.platformName+", busNumber= "+this.busNumber+" ,destination= "
                +this.destination+", departureTime= "
                +this.departureTime+", buses= "+ Arrays.toString(this.buses) +")";
    }

}
