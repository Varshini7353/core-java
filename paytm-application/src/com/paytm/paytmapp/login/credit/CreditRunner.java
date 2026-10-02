package com.paytm.paytmapp.login.credit;

import com.paytm.paytmapp.login.Paytm;

public class CreditRunner extends Paytm {

    @Override
    public void getAccountDetails(){
        super.getAccountDetails();
        System.out.println("Account No : 1234763829");
    }
}
