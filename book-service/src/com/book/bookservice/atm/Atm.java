package com.book.bookservice.atm;

public class Atm {

    public int atmId;
    public String  location;
    public String bankName;
    public String city;
    public String status;


    @Override
    public boolean equals(Object obj){
        Atm atm=(Atm)obj;


        if(this.atmId==atm.atmId &&
        this.location.equals(atm.location) &&
        this.bankName.equals(atm.bankName) &&
        this.city.equals(atm.city) &&
        this.status.equals(atm.status)){

            return true;
        }
        return false;
    }
}
