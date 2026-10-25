package com.xworkz.aadhar.adharcard;

import com.xworkz.aadhar.user.AadhaarUser;
import com.xworkz.aadhar.user.AadharInformation;

public class AadhaarInfoImpl implements AadharInformation {


        private AadhaarUser[] users = new AadhaarUser[5];
        private int index = 0;



    @Override
        public int addAadhaarUser(AadhaarUser user) {
            if (user == null || index >= users.length) {
                return 0;
            }

            if (user.getUserName() == null ||
                    user.getAadhaarNumber() == null ||
                    user.getAddress() == null) {
                return 0;
            }

            users[index++] = user;
            return 1;
        }

        @Override
        public void getAadhaarUsers() {
            for (AadhaarUser user : users) {
                if (user != null) {
                    System.out.println(
                            "User ID: " + user.getUserId()
                                    + ", Name: " + user.getUserName()
                                    + ", Address: " + user.getAddress()
                    );
                }
            }
        }

        @Override
        public String getAadhaarNumberByUserName(String userName) {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getAadhaarNumber();
                }
            }
            return "User not found";
        }

        @Override
        public String getUserNameByAadhaarNumber(String aadhaarNumber) {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getAadhaarNumber().equals(aadhaarNumber)) {
                    return user.getUserName();
                }
            }
            return "Aadhaar user not found";
        }

        @Override
        public String getAddressByUserName(String userName) {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getAddress();
                }
            }
            return "User not found";
        }

        @Override
        public long getMobileNumberByAadhaarNumber(String aadhaarNumber) {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getAadhaarNumber().equals(aadhaarNumber)) {
                    return user.getMobileNumber();
                }
            }
            return -1;
        }

        @Override
        public String getDateOfBirthByUserName(String userName) {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getDateOfBirth();
                }
            }
            return "User not found";
        }
    }
