package com.building.business.commercialbuilding;

public class VegetableShop implements CommercialBuilding{


    @Override
    public double doBusiness() {
        System.out.println("Vegetable business");
        return 600.00;
    }
}
