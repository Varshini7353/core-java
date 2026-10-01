package com.website.ecommerce.products;

public abstract  class ElectronicProducts implements Ecommerce{


    @Override
    public void placeOrder(){
        System.out.println("PlaceOrder sucessfull");
    }


}
