package com.amount.payment.methods;

public abstract class UpiPayment implements Payment{


    @Override
    public void pay(){
        System.out.println("payment done via upi");
    }
}
