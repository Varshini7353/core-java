package com.amount.payment;

import com.amount.payment.methods.OnlinePayment;
import com.amount.payment.methods.Payment;
import com.amount.payment.methods.UpiPayment;

public class PaymentRunner {

    public static void main(String[] args) {

        Payment payment = new OnlinePayment();
        payment.pay();

        Payment payment1=new OnlinePayment() ;
        payment1.refund();


    }
}