package com.xworkz.fortis.exception;

public class DoctorNotFoundException extends RuntimeException{


    public DoctorNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
