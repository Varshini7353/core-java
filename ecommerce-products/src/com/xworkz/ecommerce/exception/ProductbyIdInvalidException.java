package com.xworkz.ecommerce.exception;

public class ProductbyIdInvalidException extends RuntimeException{

    public ProductbyIdInvalidException(String errorMessage) {
        super(errorMessage);
    }
}
