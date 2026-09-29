package com.showroom.royalenfield.showroom;

import com.showroom.royalenfield.models.Models;

public class RoyalEnfeild {

    private Models[] models=new Models[23];
    int index;


    public boolean addModels(Models model){
        boolean isAdded=false;

        boolean isShowroomIdValid=false;
        boolean isShowroomNameValid=false;
        boolean isLocationValid=false;
        boolean isOwnerNameValid=false;
        boolean isContactNumberValid=false;
        boolean isModelsValid=false;


        int showroomId=model.getShowroomId();
        if(showroomId>0){
            isShowroomIdValid=true;
        }else System.out.println("Invalid showroomId");

        String showroomName=model.getShowroomName();
        if(showroomName!=null && !showroomName.isEmpty()){
            isShowroomNameValid=true;
        }else System.out.println("Invalid showroomName");

        String location=model.getLocation();
        if(location!=null && !location.isEmpty()){
            isLocationValid=true;
        }else System.out.println("Invalid location");

        String ownerName=model.getOwnerName();
        if(ownerName!=null && !ownerName.isEmpty()){
            isOwnerNameValid=true;
        }else System.out.println("Invalid ownerName");

        long contactNumber=model.getContactNumber();
        if(contactNumber>0){
            isContactNumberValid=true;
        }else System.out.println("Invalid contactNumber");

        String[] modelList=model.getModels();
        if(models!=null && models.length>0){
            isModelsValid=true;
        }else System.out.println("Invalid models");


        if(isShowroomIdValid && isShowroomNameValid && isLocationValid &&
        isOwnerNameValid && isContactNumberValid && isModelsValid){
            models[index++]=model;
            isAdded=true;
        }
        return isAdded;
    }
    public void getModelsInfo(){
        for(Models model:models){
            System.out.println(model);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }
    }
}
