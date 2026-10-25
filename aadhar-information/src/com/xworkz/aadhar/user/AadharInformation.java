package com.xworkz.aadhar.user;

public interface AadharInformation {


        int addAadhaarUser(AadhaarUser user);

        void getAadhaarUsers();

        String getAadhaarNumberByUserName(String userName);

        String getUserNameByAadhaarNumber(String aadhaarNumber);

        String getAddressByUserName(String userName);

        long getMobileNumberByAadhaarNumber(String aadhaarNumber);

        String getDateOfBirthByUserName(String userName);
    }
