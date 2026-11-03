package com.xworkz.cart.exception;

public class CartInvalidOrderException extends RuntimeException{

    public CartInvalidOrderException(String errorMessage) {
        super(errorMessage);
    }
}
