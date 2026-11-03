package com.xworkz.ecommerce.exception;

public class ProductPriceInvalidException extends RuntimeException{

    public ProductPriceInvalidException(String errorMessage) {
        super(errorMessage);
    }
}
