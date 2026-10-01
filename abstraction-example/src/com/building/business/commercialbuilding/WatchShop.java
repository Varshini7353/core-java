package com.building.business.commercialbuilding;

public class WatchShop implements CommercialBuilding{

    @Override
    public double doBusiness(){
        System.out.println("Watch business");

        return 4000.00;
    }
}
