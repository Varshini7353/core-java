package com.xworkz.ecommerce.exception;

public class ProductInvalidDiscountException extends RuntimeException{

    public ProductInvalidDiscountException(String errorMessage) {
        super(errorMessage);
    }
}
