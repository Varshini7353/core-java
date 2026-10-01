package com.building.business.commercialbuilding;

public class LensKart implements CommercialBuilding{


    @Override
    public double doBusiness() {
        System.out.println("Specs business");
        return 6000.00;
    }
}
