package com.product.light;

import com.product.light.switches.*;

public class SwitchRunner {

    public static void main(String[] args) {

        //abstraction
        Switches Switch=new Philips();
        Switch.on();
        Switch.off();
        System.out.println("--------------------------------------------");

        Switches Switch1=new Syska();
        Switch1.on();
        Switch1.off();
        System.out.println("----------------------------------------------");

        Switches Switch2=new Wipro();
        Switch2.on();
        Switch2.off();
        System.out.println("----------------------------------------------");

        Switches Switch3=new Havells();
        Switch3.on();
        Switch3.off();
        System.out.println("----------------------------------------------");

        Switches Switch4=new Bajaj();
        Switch4.on();
        Switch4.off();
        System.out.println("----------------------------------------------");

        Switches Switch5=new Crompton();
        Switch5.on();
        Switch5.off();
        System.out.println("-----------------------------------------------");

        Switches Switch6=new Orient();
        Switch6.on();
        Switch6.off();
        System.out.println("--------------------------------------------------");

        Switches Switch7=new Panasonic();
        Switch7.on();
        Switch7.off();
        System.out.println("---------------------------------------------------");

        Switches Switch8=new Surya();
        Switch8.on();
        Switch8.off();
        System.out.println("-----------------------------------------------------");

        Switches Switch9=new Osram();
        Switch9.on();
        Switch9.off();



    }
}
