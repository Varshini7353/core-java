package com.website.ecommerce.products;

public class Laptop extends ElectronicProducts{


    @Override
    public void addToCart(){
        System.out.println("Addtocart has done");
    }

    @Override
    public void cancelOrder(){
        System.out.println("Cancel the order");
    }
}
