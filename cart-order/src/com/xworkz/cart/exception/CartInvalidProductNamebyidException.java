package com.xworkz.cart.exception;

public class CartInvalidProductNamebyidException extends RuntimeException{

    public CartInvalidProductNamebyidException(String errorMessage) {
        super(errorMessage);
    }
}
