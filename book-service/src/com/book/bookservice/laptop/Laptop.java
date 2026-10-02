package com.book.bookservice.laptop;

public class Laptop {

    public int laptopId;
    public String brand;
    public String  model;
    public double price;
    public String processor;


    @Override
    public boolean equals(Object obj){

        Laptop laptop = (Laptop) obj; //down casting

        if(this.laptopId==laptop.laptopId &&
        this.brand.equals(laptop.brand) &&
        this.model.equals(laptop.model) &&
        this.price==laptop.price &&
        this.processor.equals(laptop.processor)){
            return true;
        }

        return false;
    }
}
