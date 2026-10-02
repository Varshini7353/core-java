package com.book.bookservice.bankaccount;

public class BankAccount {

    public int bankId;
    public int accountNumber;
    public String  accountHolder;
    public String bankName;
    public double balance;



    @Override
    public boolean equals(Object obj){

        BankAccount account=(BankAccount) obj;


        if(this.bankId==account.bankId &&
        this.accountNumber==account.accountNumber &&
        this.accountHolder.equals(account.accountHolder) &&
        this.bankName.equals(account.bankName) &&
        this.balance==account.balance){
            return true;
        }
        return false;
    }

}
