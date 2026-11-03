package com.xworkz.ecommerce.exception;

public class ProductInvalidCategoryException extends RuntimeException{

    public ProductInvalidCategoryException(String errorMessage) {

        super(errorMessage);
    }
}
