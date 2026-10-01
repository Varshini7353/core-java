package com.building.business;

import com.building.business.commercialbuilding.*;

public class BuildingRunner {

    public static void main(String[] args) {

        //abstraction
        CommercialBuilding commercialBuilding=new HariSuperSandwich();
        commercialBuilding.doBusiness();

        CommercialBuilding commercialBuilding1=new WatchShop();
        commercialBuilding1.doBusiness();

        CommercialBuilding commercialBuilding2=new FlyingMachine();
        commercialBuilding2.doBusiness();

        CommercialBuilding commercialBuilding3=new VegetableShop();
        commercialBuilding3.doBusiness();

        CommercialBuilding commercialBuilding4=new LensKart();
        commercialBuilding4.doBusiness();
    }
}
