package com.xworkz.station.officer;

public interface PoliceStation {

    int addPoliceOfficer(PoliceOfficer policeOfficer);

    void getPoliceOfficer();

    String getPoliceOfficerNameByPoliceOfficerId(int policeOfficerId);

    String getPoliceOfficerDepartmentByPoliceOfficerName(String policeOfficerName);

    String getPoliceOfficerBadgeNumberByPoliceOfficerRank(int policeOfficerRank);

    boolean getPoliceOfficerOnDutyByPoliceOfficerAge(int policeOfficerAge);

    int getPoliceOfficerRankBypoliceOfficerId(int policeOfficerId);

    void getPoliceOfficerNameByPoliceOfficerRank(int rank);
}