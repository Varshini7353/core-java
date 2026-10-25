package com.xworkz.aadhar.user;

public class AadhaarUser {


        private int userId;
        private String userName;
        private String aadhaarNumber;
        private String address;
        private long mobileNumber;
        private String dateOfBirth;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAadhaarNumber() {
            return aadhaarNumber;
        }

        public void setAadhaarNumber(String aadhaarNumber) {
            this.aadhaarNumber = aadhaarNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

    @Override
    public String toString() {
        return "AadhaarUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

