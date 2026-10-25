package com.xworkz.aadhar;


import com.xworkz.aadhar.adharcard.AadhaarInfoImpl;
import com.xworkz.aadhar.user.AadhaarUser;
import com.xworkz.aadhar.user.AadharInformation;

import java.util.Scanner;

public class AadhaarRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Aadhaar users: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        if (size <= 0) {
            System.out.println("Enter a valid number");
            scanner.close();
            return;
        }

        AadharInformation aadhaarInfo = new AadhaarInfoImpl();

        for (int i = 0; i < size; i++) {

            AadhaarUser user = new AadhaarUser();

            System.out.println("\nEnter details for Aadhaar user " + (i + 1));

            System.out.print("Enter user ID: ");
            user.setUserId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Enter user name: ");
            user.setUserName(scanner.nextLine());

            System.out.print("Enter Aadhaar number: ");
            user.setAadhaarNumber(scanner.nextLine());

            System.out.print("Enter address: ");
            user.setAddress(scanner.nextLine());

            System.out.print("Enter mobile number: ");
            user.setMobileNumber(scanner.nextLong());
            scanner.nextLine();

            System.out.print("Enter date of birth: ");
            user.setDateOfBirth(scanner.nextLine());

            int result = aadhaarInfo.addAadhaarUser(user);

            if (result > 0) {
                System.out.println("Aadhaar user added successfully!");
            } else {
                System.out.println("Aadhaar user not added");
            }
        }

        System.out.println("\n--- All Aadhaar Users ---");
        aadhaarInfo.getAadhaarUsers();

        System.out.print("\nEnter user name to find Aadhaar number: ");
        String searchName = scanner.nextLine();
        String aadhaarNumber =
                aadhaarInfo.getAadhaarNumberByUserName(searchName);
        System.out.println("Aadhaar number: " + aadhaarNumber);

        System.out.print("\nEnter Aadhaar number to find user name: ");
        String searchAadhaar = scanner.nextLine();
        String userName =
                aadhaarInfo.getUserNameByAadhaarNumber(searchAadhaar);
        System.out.println("User name: " + userName);

        System.out.print("\nEnter user name to find address: ");
        String addressName = scanner.nextLine();
        String address = aadhaarInfo.getAddressByUserName(addressName);
        System.out.println("Address: " + address);

        System.out.print("\nEnter Aadhaar number to find mobile number: ");
        String mobileAadhaar = scanner.nextLine();
        long mobileNumber =
                aadhaarInfo.getMobileNumberByAadhaarNumber(mobileAadhaar);
        System.out.println("Mobile number: " + mobileNumber);

        System.out.print("\nEnter user name to find date of birth: ");
        String dobName = scanner.nextLine();
        String dateOfBirth =
                aadhaarInfo.getDateOfBirthByUserName(dobName);
        System.out.println("Date of birth: " + dateOfBirth);

        scanner.close();
    }
}