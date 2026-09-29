package com.transportation.buses.bmtc;

import com.transportation.buses.platform.Platform;

public class Bmtc {


    private Platform[] platforms=new Platform[26];
    int index;


    public boolean addBuses(Platform platform){
        boolean isAdded=false;

        boolean isPlatformIdValid=false;
        boolean isPlatformNameValid=false;
        boolean isBusNumberValid=false;
        boolean isDestinationValid=false;
        boolean isDepartureTimeValid=false;
        boolean isBusesValid=false;


        int platformId=platform.getPlatformId();
        if(platformId>0){
            isPlatformIdValid=true;
        }else System.out.println("Invalid platformId");

        String platformName=platform.getPlatformName();
        if(platformName!=null && !platformName.isEmpty()){
            isPlatformNameValid=true;
        }else System.out.println("Invalid platform name");

        String busNumber=platform.getBusNumber();
        if(busNumber!=null && !busNumber.isEmpty()){
            isBusNumberValid=true;
        }else System.out.println("Invalid bus number");

        String destination=platform.getDestination();
        if(destination!=null && !destination.isEmpty()){
            isDestinationValid=true;
        }else System.out.println("Invalid destination");

        String departureTimings=platform.getDepartureTime();
        if(departureTimings!=null && !departureTimings.isEmpty()){
            isDepartureTimeValid=true;
        }else System.out.println("Invalid departure time");

        String[] buses=platform.getBuses();
        if(buses!=null && buses.length>0){
            isBusesValid=true;
        }else System.out.println("Invalid buses");


        if(isPlatformIdValid && isPlatformNameValid && isBusNumberValid &&
        isDestinationValid && isDepartureTimeValid && isBusesValid){
            platforms[index++]=platform;
            isAdded=true;

        }
        return isAdded;

    }
    public void getBusInfo(){

        for(Platform platform:platforms){
            System.out.println(platform);
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }
    }
}
