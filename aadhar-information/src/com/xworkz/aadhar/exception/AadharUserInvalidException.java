package com.xworkz.aadhar.exception;

public class AadharUserInvalidException extends RuntimeException{

    public AadharUserInvalidException(String errorMessage) {
        super(errorMessage);
    }
}
