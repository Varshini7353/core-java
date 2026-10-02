package com.paytm.paytmapp;
import com.paytm.paytmapp.login.Paytm;
import com.paytm.paytmapp.login.credit.CreditRunner;
import com.paytm.paytmapp.login.debit.DebitRunner;


public class PaytmRunner {

    public static void main(String[] args) {

       Paytm CreditRunner=new CreditRunner();
       CreditRunner.getAccountDetails();

       Paytm DebitRunner=new DebitRunner();
       DebitRunner.getAccountDetails();
    }
}
