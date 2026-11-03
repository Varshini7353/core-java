package com.xworkz.cart.exception;

public class CartInvalidPricebyOrderIdException extends RuntimeException{

    public CartInvalidPricebyOrderIdException(String errMessage) {

        super(errMessage);
    }
}
