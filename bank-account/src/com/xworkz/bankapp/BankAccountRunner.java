package com.xworkz.bankapp;

import com.xworkz.bankapp.account.BankAccount;
import com.xworkz.bankapp.account.salary.SalaryAccount;
import com.xworkz.bankapp.account.savings.SavingsAccount;

public class BankAccountRunner {

    public static void main(String[] args) {
        
        System.out.println("Main started");

        BankAccount bank=new SavingsAccount();//upcasting
        bank.getAccountDetails();


        SavingsAccount salary =(SavingsAccount)bank;//downcasting
        salary.getSavingsInfo();
        System.out.println("Main ended");

    }
}
