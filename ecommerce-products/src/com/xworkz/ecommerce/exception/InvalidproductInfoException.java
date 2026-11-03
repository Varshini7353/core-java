package com.xworkz.ecommerce.exception;

public class InvalidproductInfoException extends RuntimeException{

    public InvalidproductInfoException(String errorMessage) {
        super(errorMessage);
    }
}
