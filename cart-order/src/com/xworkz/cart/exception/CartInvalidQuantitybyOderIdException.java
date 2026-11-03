package com.xworkz.cart.exception;

public class CartInvalidQuantitybyOderIdException extends RuntimeException{

    public CartInvalidQuantitybyOderIdException(String errorMessage) {
        super(errorMessage);
    }
}
