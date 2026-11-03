package com.xworkz.aadhar.adharcard;

import com.xworkz.aadhar.exception.*;
import com.xworkz.aadhar.user.AadhaarUser;
import com.xworkz.aadhar.user.AadharInformation;

public class AadhaarInfoImpl implements AadharInformation {


        int size;
        private AadhaarUser[] users = new AadhaarUser[size];
        int index ;

    public AadhaarInfoImpl(int size) {
        this.size=size;
        users=new AadhaarUser[size];

    }


    @Override
        public boolean addAadhaarUser(AadhaarUser user) {
          boolean isAdded=false;

          boolean isUserIdValid=false;
          boolean isUserNameValid=false;
          boolean isAadhaarNumberValid=false;
          boolean isAddressValid=false;
          boolean isMobileNumberValid=false;
          boolean isDateOfBirthValid=false;

          int userId=user.getUserId();
          if(userId>0){
              isUserIdValid=true;
          }else System.out.println("Invalid userId");


          String userName=user.getUserName();
          if(userName!=null && !userName.isEmpty()){
              isUserNameValid=true;
          }else System.out.println("Invalid userName");

          String aadhaarNumber=user.getAadhaarNumber();
          if(aadhaarNumber!=null && !aadhaarNumber.isEmpty()){
              isAadhaarNumberValid=true;
          }else System.out.println("Invalid aadhar number");

          String address=user.getAddress();
          if(address!=null && !address.isEmpty()){
              isAddressValid=true;
          }else System.out.println("Invalid address");

          long mobileNumber=user.getMobileNumber();
          if(mobileNumber>0){
              isMobileNumberValid=true;
          }else System.out.println("Invalid mobileNumber");

          String dateOfBirth=user.getDateOfBirth();
          if(dateOfBirth!=null && !dateOfBirth.isEmpty()){
              isDateOfBirthValid=true;
          }else System.out.println("Invalid dateOfBirth");

          if(isUserIdValid && isUserNameValid && isAadhaarNumberValid && isAddressValid
          && isMobileNumberValid && isDateOfBirthValid){

              if (index < users.length) {
                  users[index++] = user;
                  return true;
              } else {
                  System.out.println("User list is full");
              }
          } else {
              System.out.println("Invalid User details");
          }

        return false;
    }


        @Override
        public void getAadhaarUsers() {
        try {
            for (AadhaarUser user : users) {
                if (user != null) {
                    System.out.println("User ID: " + user.getUserId() + ", Name: " + user.getUserName()
                            + ", Address: " + user.getAddress());
                }
            }
            if (users == null) {
                AadharUserInvalidException exception = new AadharUserInvalidException("Sorry... invalid users");
                throw exception;
            }
        }catch (AadharUserInvalidException zz){
            zz.printStackTrace();
        }
        }

        @Override
        public String getAadhaarNumberByUserName(String userName) {

        try {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getAadhaarNumber();
                }
            }
            if (users == null) {
                AadharUsersbyNameInvalidException exception = new AadharUsersbyNameInvalidException("Sorry Invalid fetch details");
                throw exception;
            }
        }catch (AadharUsersbyNameInvalidException ss){
            ss.printStackTrace();
        }
            return "User not found";
        }

        @Override
        public String getUserNameByAadhaarNumber(String aadhaarNumber) {
        try {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getAadhaarNumber().equals(aadhaarNumber)) {
                    return user.getUserName();
                }
            }
            if (users == null) {
                AadharNamebyNumberInvalidException exception = new AadharNamebyNumberInvalidException("Invalid aadharNUmber");
                throw exception;
            }
        }catch (AadharNamebyNumberInvalidException ff){
            ff.printStackTrace();
        }
            return "Aadhaar user not found";
        }

        @Override
        public String getAddressByUserName(String userName) {

        try {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getAddress();
                }
            }
            if (users == null) {
                AadharInvalidAddressbyUserException exception = new AadharInvalidAddressbyUserException("Invalid address");
                throw exception;
            }
        }catch (AadharInvalidAddressbyUserException oo){
            oo.printStackTrace();
        }
            return "User not found";
        }

        @Override
        public long getMobileNumberByAadhaarNumber(String aadhaarNumber) {

        try {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getAadhaarNumber().equals(aadhaarNumber)) {
                    return user.getMobileNumber();
                }
            }
            if (users == null) {
                MobileNoInvalidException exception = new MobileNoInvalidException("Invalid mobileNo");
                throw exception;
            }
        }catch (MobileNoInvalidException dd){
            dd.printStackTrace();
        }
            return -1;
        }

        @Override
        public String getDateOfBirthByUserName(String userName) {

        try {
            for (AadhaarUser user : users) {
                if (user != null &&
                        user.getUserName().equalsIgnoreCase(userName)) {
                    return user.getDateOfBirth();
                }
            }
            if (users == null) {
                DobbyUsersInvalidException exception = new DobbyUsersInvalidException("Sorry invalid dob");
                throw exception;
            }
        }catch (DobbyUsersInvalidException ee){
            ee.printStackTrace();
        }
            return "User not found";
        }

    @Override
    public boolean updateMobileNumberByUserName(long newMobileNo, String userName) {
        boolean isMobileNumberUpdated=false;

        try {
            for (AadhaarUser user : users) {
                if (user.getUserName().equals(userName)) {
                    user.setMobileNumber(newMobileNo);
                    isMobileNumberUpdated = true;
                }

            }
            if (users == null) {
                MobileNobyUsernameInvalidException exception = new MobileNobyUsernameInvalidException("Invalid mobileNo");
                throw exception;
            }
        }catch (MobileNobyUsernameInvalidException ee){
            ee.printStackTrace();
        }
        return isMobileNumberUpdated;
    }
}
