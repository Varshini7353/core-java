package com.xworkz.ecommerce.exception;

public class ProductInvalidInfoException extends RuntimeException{

    public ProductInvalidInfoException(String errorMessage) {

        super(errorMessage);
    }
}
