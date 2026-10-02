package com.book.bookservice.insurance;

public class Insurance {


    public int policyId;
    public String policyName;
    public String company;
    public double premium;
    public String policyHolderName;


    @Override
    public boolean equals(Object obj){

        Insurance insurance=(Insurance)obj;

        if(this.policyId==insurance.policyId &&
        this.policyName.equals(insurance.policyName) &&
        this.company.equals(insurance.company) &&
        this.premium==insurance.premium &&
        this.policyHolderName.equals(insurance.policyHolderName)){

            return true;
        }
        return false;
    }
}
