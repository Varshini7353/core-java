package com.book.bookservice.shipping;

public class Order {

     public int orderId;
     public String  productName;
     public String address;
     public double price;
     public String customerName;


     @Override
    public boolean equals(Object obj){

         Order order=(Order)obj;

         if(this.orderId==order.orderId &&  this.productName.equals(order.productName)
         &&  this.address.equals(order.address) &&   this.price==order.price
         &&  this.customerName.equals(order.customerName)){
             return true;
         }

         return false;
     }


}
