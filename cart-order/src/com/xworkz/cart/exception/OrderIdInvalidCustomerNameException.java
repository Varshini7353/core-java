package com.xworkz.cart.exception;

public class OrderIdInvalidCustomerNameException extends RuntimeException{

    public OrderIdInvalidCustomerNameException(String errorMessage) {
        super(errorMessage);
    }
}
