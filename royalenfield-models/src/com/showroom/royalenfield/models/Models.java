package com.showroom.royalenfield.models;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Models {

    private int showroomId;
    private String showroomName;
    private String location;
    private String ownerName;
    private long contactNumber;
    private String[] models;


    public int getShowroomId(){
        return showroomId;
    }

    public void setShowroomId(int showroomId){
        this.showroomId=showroomId;
    }

    public String getShowroomName(){
        return showroomName;
    }

    public void setShowroomName(String showroomName){
        this.showroomName=showroomName;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    public long getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }

    public String[] getModels(){
        return models;
    }

    public void setModels(String[] models){
        this.models=models;
    }

    @Override
    public String toString(){
        return "Models-(showroomId= "+this.showroomId+", showroomName= "
                +this.showroomName+", location= "+this.location+" ,ownerName="
                +this.ownerName+" ,contactNumber= "
                +this.contactNumber+", models="+ Arrays.toString(this.models)+")";
    }
}

