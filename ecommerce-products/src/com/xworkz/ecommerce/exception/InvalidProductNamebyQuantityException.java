package com.xworkz.ecommerce.exception;

public class InvalidProductNamebyQuantityException extends RuntimeException{

    public InvalidProductNamebyQuantityException(String errorMessage) {
        super(errorMessage);
    }
}
