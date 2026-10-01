package com.machine.atm;

import com.machine.atm.card.*;

public class AtmRunner {
    public static void main(String[] args) {



        Card card2=new BankAtm();
        card2.swipe();

        Card card1 = new BankAtm();
        card1.inserts();


    }




}
