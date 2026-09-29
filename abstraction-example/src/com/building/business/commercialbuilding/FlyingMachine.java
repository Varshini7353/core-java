package com.building.business.commercialbuilding;

public class FlyingMachine implements CommercialBuilding{


    @Override
    public double doBusiness() {
        System.out.println("Cloth buiness");
        return 3000.00;
    }
}
