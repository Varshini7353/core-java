package com.book.bookservice.mobile;

public class Mobile {


    public int mobileId;
    public String brand;
    public String model;
    public double price;
    public String strorage;


    @Override
    public boolean equals(Object obj){

        Mobile mobile=(Mobile)obj;

        if(this.mobileId==mobile.mobileId &&
        this.brand.equals(mobile.brand) &&
        this.model.equals(mobile.model) &&
        this.price==mobile.price &&
        this.strorage.equals(mobile.strorage)){
            return true;
        }
        return false;
    }
}
