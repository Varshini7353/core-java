package com.xworkz.ecommerce.exception;

public class ProductInvalidBrandException extends RuntimeException{

    public ProductInvalidBrandException(String errorMessage) {
        super(errorMessage);
    }
}
