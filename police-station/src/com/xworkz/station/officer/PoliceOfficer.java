package com.xworkz.station.officer;

public class PoliceOfficer {

    private int policeId;
    private String officerName;
    private String department;
    private String badgeNumber;
    private int rank;
    private boolean onDuty;
    private int policeOfficerAge;

    public int getPoliceId() {
        return policeId;
    }

    public void setPoliceId(int policeId) {
        this.policeId = policeId;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean getOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public int getPoliceOfficerAge() {
        return policeOfficerAge;
    }

    public void setPoliceOfficerAge(int policeOfficerAge) {
        this.policeOfficerAge = policeOfficerAge;
    }

    @Override
    public String toString() {
        return "Police ID: " + policeId
                + ", Name: " + officerName
                + ", Department: " + department
                + ", Badge Number: " + badgeNumber
                + ", Rank: " + rank
                + ", On Duty: " + onDuty
                + ", Age: " + policeOfficerAge;
    }
}