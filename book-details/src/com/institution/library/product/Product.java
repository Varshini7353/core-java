package com.institution.library.product;

import java.util.Objects;

public class Product {


    private int productId;
    private String productName;
    private double price;
    private String brandName;
    private String modelNumber;
    private int partNumber;


    public Product(){

    }

    public void setProductId(int id){
        productId=id;
    }

    public int getProductId(){
        return productId;
    }


    public void setProductName(String name){
        productName=name;
    }

    public String getProductName(){
        return productName;
    }


    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }


    public void setBrandName(String brand){
        brandName=brand;
    }

    public String getBrandName(){
        return brandName;
    }


    public void setModelNumber(String mNum){
        modelNumber=mNum;
    }

    public String getModelNumber(){
        return modelNumber;
    }


    public void setPartNumber(int pNum){
        partNumber=pNum;
    }

    public int getPartNumber(){
        return partNumber;
    }


    @Override
    public int hashCode(){
        return Objects.hash(productId,productName,price,brandName,modelNumber,partNumber);
    }

    @Override
    public String toString(){
        return "Product-(productId=" +this.productId+",name= "+this.productName+", price= "+this.price+", bName="+
                this.brandName+" ,mNum= "+modelNumber+" ,pNum= "+partNumber+")";
    }

    @Override
    public boolean equals(Object obj){
        Product product=(Product) obj;

        if(this.productId==product.productId &&
        this.productName.equals(product.productName) &&
        this.price==product.price &&
        this.brandName.equals(product.brandName) &&
        this.modelNumber.equals(product.modelNumber) &&
        this.partNumber==product.partNumber){

            return true;
        }
        return false;
    }



}
