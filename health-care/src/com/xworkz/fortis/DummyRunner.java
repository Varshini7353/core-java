package com.xworkz.fortis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DummyRunner {


    public static void main(String[] args) {

        System.out.println("Main started");


        String str = null;
        try {
            //str.hashCode();
            str.equals("");
        } catch (NullPointerException e) {
            System.out.println("Please provide correct input");
        }

        System.out.println("-------------------------------------------");

        String age = "78A";
        try {
            Integer.parseInt(age);
            System.out.println(age);
        } catch (NumberFormatException ref) {
            System.out.println("Enter the correct age");
        }

        System.out.println("--------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity:");
        try {
            int quantity = sc.nextInt();
            System.out.println(quantity);
        } catch (InputMismatchException e) {
            System.out.println(" Please Enter the correct quantity");
        }

        System.out.println("-------------------------------------------");

        try {
            String str1 = null;
            str1.isEmpty();
            System.out.println(str1);
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Please provide correct input");
        }

        System.out.println("---------------------------------");

        try {
            int a = 34 / 0;
            System.out.println("The result is:" + a);
        } catch (ArithmeticException e) {
            System.out.println("please enetr the correct value");
        }
    }

}






