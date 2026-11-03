package com.xworkz.ecommerce.exception;

public class ProductInvalidPriceByNameException extends RuntimeException{


    public ProductInvalidPriceByNameException(String errorMessage) {

        super(errorMessage);
    }
}
