package com.shop.bakery.bakery;

import com.shop.bakery.condiments.Condiments;

public class Bakery {

    private Condiments[] condiments=new Condiments[17];
    int index;

    public boolean addCondiments(Condiments condiment){
        boolean isAdded=true;


        boolean isBakeryIdValid=false;
        boolean isBakeryNameValid=false;
        boolean isLocationValid=false;
        boolean isOwnerNameValid=false;
        boolean isPriceValid=false;
        boolean isCondimentsValid=false;


        int bakeryId=condiment.getBakeryId();
        if(bakeryId>0){
            isBakeryIdValid=true;
        }else System.out.println("Invalid bakery Id");

        String bakeryName=condiment.getBakeryName();
        if(bakeryName!=null && !bakeryName.isEmpty()){
            isBakeryNameValid=true;
        }else System.out.println("Invalid bakeryName");

        String location=condiment.getLocation();
        if(location!=null && !location.isEmpty()){
            isLocationValid=true;
        }else System.out.println("Invalid location");

        String ownerName=condiment.getOwnerName();
        if(ownerName!=null && !ownerName.isEmpty()){
            isOwnerNameValid=true;
        }else System.out.println("Invalid ownerName");

        double price=condiment.getPrice();
        if(price>0){
            isPriceValid=true;
        }else System.out.println("Invalid price");

        String[] condimentsList=condiment.getCondiments();
        if(condiments!=null && condiments.length>0){
            isCondimentsValid=true;
        }else System.out.println("Invalid condiments");


        if(isBakeryIdValid && isBakeryNameValid && isLocationValid &&
        isOwnerNameValid && isPriceValid && isCondimentsValid){
            condiments[index++]=condiment;
            isAdded=true;
        }
        return isAdded;
    }
    public void getCondimentsInfo(){
        for (Condiments condiment:condiments){
            System.out.println(condiment);
            System.out.println("-------------------------------------------------------------------------------------------------------------");
        }
    }
}
