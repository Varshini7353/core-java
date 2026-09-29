package com.shop.bakery.condiments;

import java.util.Arrays;

public class Condiments {

    private int bakeryId;
    private String bakeryName;
    private String location;
    private String ownerName;
    private double price;
    private String[] condiments;


    public int getBakeryId() {
        return bakeryId;
    }

    public void setBakeryId(int bakeryId) {
        this.bakeryId = bakeryId;
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getCondiments() {
        return condiments;
    }

    public void setCondiments(String[] condiments) {
        this.condiments = condiments;
    }

    @Override
    public String toString() {
        return "Condiments-{bakeryId= "+this.bakeryId+",bakeryName="
                +this.bakeryName+", locatiom="+this.location+" ,ownerName="
                +this.ownerName+",price= "+this.price+", condiments="+Arrays.toString(this.condiments)+")";

    }
}
