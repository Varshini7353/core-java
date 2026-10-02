package com.account.bank;

import com.account.bank.axis.AxisBank;

public class AxisbankRunner {

    public static void main(String[] args) {

        AxisBank bank=new AxisBank();
        System.out.println("Bank id is:"+bank.bankId);
        System.out.println("ifsc code :"+bank.ifscCode);
        System.out.println("address:"+bank.address);

    }
}
