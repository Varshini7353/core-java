package com.xworkz.cart.exception;

public class CartInvalidCartStatusException extends RuntimeException{

    public CartInvalidCartStatusException(String  errorMessage) {
        super(errorMessage);
    }
}
