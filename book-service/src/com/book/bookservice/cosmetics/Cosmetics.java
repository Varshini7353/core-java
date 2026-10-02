package com.book.bookservice.cosmetics;

public class Cosmetics {

    public int productId;
    public String productName;
    public String brand;
    public double  price;
    public String address;


    @Override
    public boolean equals(Object obj){

        Cosmetics cosmetics=(Cosmetics) obj;

        if(this.productId==cosmetics.productId &&
        this.productName.equals(cosmetics.productName) &&
        this.brand.equals(cosmetics.brand) &&
        this.price==cosmetics.price &&
        this.address.equals(cosmetics.address)){
            return true;
        }
        return false;
    }
}
