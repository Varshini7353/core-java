package com.website.ecommerce;

import com.website.ecommerce.products.Ecommerce;
import com.website.ecommerce.products.Laptop;

public class EcommerceRunner {

    public static void main(String[] args) {
        Ecommerce ecommerce=new Laptop();
        ecommerce.placeOrder();

        Ecommerce ecommerce1=new Laptop();
        ecommerce1.addToCart();

        Ecommerce ecommerce2=new Laptop();
        ecommerce2.cancelOrder();

    }


}
