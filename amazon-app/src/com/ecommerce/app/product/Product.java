package com.ecommerce.app.product;

import java.util.Arrays;

public class Product {


    private int productId;
    private String productName;
    private int price;
    private String customerName;
    private String address;
    private String[] productsList;


    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId=productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName=productName;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String[] getProductsList(){
        return productsList;
    }

    public void setProductsList(String[] productsList){
        this.productsList=productsList;
    }

    public String toString(){
        return "Product (id= "+this.productId+",  productName= "+this.
                productName+" ,price= "+this.price+" , customerName= "+this.customerName+" , address= "+this.
                address+", productList= "+ Arrays.toString(this.productsList) +")";


    }

}
