package com.building.business.commercialbuilding;

public class HariSuperSandwich implements CommercialBuilding{

    @Override
    public double doBusiness(){
        System.out.println("Super sandwich+ chats");

        return 30000.00;
    }
}
