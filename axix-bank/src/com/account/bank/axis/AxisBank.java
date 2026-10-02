package com.account.bank.axis;

public class AxisBank {

    //instance variables
    public int bankId;
    String bankName;
    public String address;
    public String ifscCode;
    String micrCode;
    double balance;
    long phoneNumber;

    public AxisBank(){
        this(1,"Axisbank",78765789768L);
    }

    public AxisBank(int bankId,String bankName,long phoneNumber){
        this("Bhasham circle","axis567878","779986uih",564678.00 );
    this.bankId=bankId;
    this.bankName=bankName;
    this.phoneNumber=phoneNumber;
    }

    public AxisBank(String address,String ifscCode,String micrCode,double balance){
        this.address=address;
        this.ifscCode=ifscCode;
        this.micrCode=micrCode;
        this.balance=balance;

    }
}
