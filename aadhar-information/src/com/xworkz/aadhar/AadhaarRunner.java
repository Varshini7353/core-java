
        package com.xworkz.aadhar;

import com.xworkz.aadhar.adharcard.AadhaarInfoImpl;
import com.xworkz.aadhar.user.AadhaarUser;
import com.xworkz.aadhar.user.AadharInformation;

import java.util.Scanner;

public class AadhaarRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of Aadhaar users: ");
            int size = sc.nextInt();
            sc.nextLine();

            if (size <= 0) {
                System.out.println("Enter a valid number");
                sc.close();
                return;
            }

            AadharInformation aadhaarInfo = new AadhaarInfoImpl(size);

            for (int i = 0; i < size; i++) {

                AadhaarUser user = new AadhaarUser();

                System.out.println("\nEnter details for Aadhaar user " + (i + 1));

                System.out.print("Enter user ID: ");
                user.setUserId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter user name: ");
                user.setUserName(sc.nextLine());

                System.out.print("Enter Aadhaar number: ");
                user.setAadhaarNumber(sc.nextLine());

                System.out.print("Enter address: ");
                user.setAddress(sc.nextLine());

                System.out.print("Enter mobile number: ");
                user.setMobileNumber(sc.nextLong());
                sc.nextLine();

                System.out.print("Enter date of birth: ");
                user.setDateOfBirth(sc.nextLine());

                aadhaarInfo.addAadhaarUser(user);
            }

            String YesOrNo;

            do {
                System.out.println("\n===== Aadhaar Menu =====");
                System.out.println("Press 1 to getAadhaarUsers");
                System.out.println("Press 2 to getAadhaarNumberByUserName");
                System.out.println("Press 3 to getUserNameByAadhaarNumber");
                System.out.println("Press 4 to getAddressByUserName");
                System.out.println("Press 5 to getMobileNumberByAadhaarNumber");
                System.out.println("Press 6 to getDateOfBirthByUserName");
                System.out.println("Press 7  to updateMobileNumberByUserName");

                System.out.print("Enter your option: ");
                int options = sc.nextInt();
                sc.nextLine();

                switch (options) {

                    case 1:
                        System.out.println("\n--- All Aadhaar Users ---");
                        aadhaarInfo.getAadhaarUsers();
                        break;


                    case 2:
                        System.out.print("\nEnter user name to find Aadhaar number: ");
                        String searchName = sc.nextLine();
                        String aadhaarNumber =
                                aadhaarInfo.getAadhaarNumberByUserName(searchName);
                        System.out.println("Aadhaar number: " + aadhaarNumber);
                        break;

                    case 3:
                        System.out.print("\nEnter Aadhaar number to find user name: ");
                        String searchAadhaar = sc.nextLine();
                        String userName =
                                aadhaarInfo.getUserNameByAadhaarNumber(searchAadhaar);
                        System.out.println("User name: " + userName);
                        break;

                    case 4:
                        System.out.print("\nEnter user name to find address: ");
                        String addressName = sc.nextLine();
                        String address = aadhaarInfo.getAddressByUserName(addressName);
                        System.out.println("Address: " + address);
                        break;

                    case 5:
                        System.out.print("\nEnter Aadhaar number to find mobile number: ");
                        String mobileAadhaar = sc.nextLine();
                        long mobileNumber =
                                aadhaarInfo.getMobileNumberByAadhaarNumber(mobileAadhaar);
                        System.out.println("Mobile number: " + mobileNumber);
                        break;

                    case 6:
                        System.out.print("\nEnter user name to find date of birth: ");
                        String dobName = sc.nextLine();
                        String dateOfBirth =
                                aadhaarInfo.getDateOfBirthByUserName(dobName);
                        System.out.println("Date of birth: " + dateOfBirth);
                        break;

                    case 7:
                        boolean newMobileNo = aadhaarInfo.updateMobileNumberByUserName(735304799, "varsha");
                        System.out.println(newMobileNo);
                        break;

                    default:
                        System.out.println("Enter valid options");
                }

                System.out.print("Do you want to continue? (Y/N): ");
                YesOrNo = sc.next();

            } while (YesOrNo.equalsIgnoreCase("Y"));

        }finally {
            sc.close();
        }

    }
}