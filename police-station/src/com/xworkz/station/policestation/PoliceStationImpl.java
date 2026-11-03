package com.xworkz.station.policestation;

import com.xworkz.station.exception.*;
import com.xworkz.station.officer.PoliceOfficer;
import com.xworkz.station.officer.PoliceStation;

public class PoliceStationImpl implements PoliceStation {

    PoliceOfficer[] policeOfficer;
    int index;

    public PoliceStationImpl(int size) {
        policeOfficer = new PoliceOfficer[size];
    }

    @Override
    public int addPoliceOfficer(PoliceOfficer policeOfficer) {
        boolean isAdded=false;

        boolean isPoliceIdValid=false;
        boolean isOfficerNameValid=false;
        boolean isDepartmentValid=false;
        boolean isBadgeNumberValid=false;
        boolean isRankValid=false;
        boolean isOnDutyValid=false;
        boolean isPoliceOfficerAgeValid=false;

        int policeId=policeOfficer.getPoliceId();
        if(policeId>0){
            isPoliceIdValid=true;
        }else System.out.println("Invalid policeId");

        String officerName=policeOfficer.getOfficerName();
        if(officerName!=null && !officerName.isEmpty()){
            isOfficerNameValid=true;
        }else System.out.println("Invalid officerName");

        String department=policeOfficer.getDepartment();
        if(department!=null && !department.isEmpty()){
            isDepartmentValid=true;
        }else System.out.println("Invalid department");

        String badgeNumber=policeOfficer.getBadgeNumber();
        if(badgeNumber!=null && !badgeNumber.isEmpty()){
            isBadgeNumberValid=true;
        }else System.out.println("Invalid badgeNumber");

        int rank =policeOfficer.getRank();
        if(rank>0){
            isRankValid=true;
        }else System.out.println("Invalid Rank");

        boolean onDuty=policeOfficer.getOnDuty();
        if(onDuty==true){
            isOnDutyValid=true;
        }else System.out.println("Invalid onduty");

        int policeOfficerAge=policeOfficer.getPoliceOfficerAge();
        if(policeOfficerAge>0){
            isPoliceOfficerAgeValid=true;
        }else System.out.println("Invalid officerAge");


        if(isPoliceIdValid && isOfficerNameValid && isDepartmentValid && isBadgeNumberValid
        && isRankValid && isOnDutyValid && isPoliceOfficerAgeValid){

            if (index < this.policeOfficer.length) {
                this.policeOfficer[index++] = policeOfficer;
                return 1;
            } else {
                System.out.println("Police station list is full");
            }

        } else {
            System.out.println("Invalid police officer details");
        }

        return 0;
    }

    @Override
    public void getPoliceOfficer() {

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null) {
                    System.out.println(officer);
                } else {
                    System.out.println("Police officer not added");
                }
            }

            if (policeOfficer == null) {
                PoliceOfficerInvalidException exception = new PoliceOfficerInvalidException("Sorry invalid officers");
                throw exception;
            }
        }catch (PoliceOfficerInvalidException qq){
            qq.printStackTrace();
        }
    }

    @Override
    public String getPoliceOfficerNameByPoliceOfficerId(int policeOfficerId) {

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getPoliceId() == policeOfficerId) {
                    return officer.getOfficerName();
                }
            }

            if (policeOfficer == null) {
                PoliceOfficerNameInvalidByIdException exception = new PoliceOfficerNameInvalidByIdException("Invalid Name");
                throw exception;
            }
        }catch (PoliceOfficerNameInvalidByIdException q){
            q.printStackTrace();
        }
        return null;
    }

    @Override
    public String getPoliceOfficerDepartmentByPoliceOfficerName(String policeOfficerName) {

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getOfficerName().equalsIgnoreCase(policeOfficerName)) {
                    return officer.getDepartment();
                }
            }

            if (policeOfficer == null) {
                PoliceOfficerDeptInvalidByNameException exception = new PoliceOfficerDeptInvalidByNameException("Invalid dept");
                throw exception;
            }
        }catch (PoliceOfficerDeptInvalidByNameException a){
            a.printStackTrace();
        }
        return null;
    }

    @Override
    public String getPoliceOfficerBadgeNumberByPoliceOfficerRank(int policeOfficerRank) {

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getRank() == policeOfficerRank) {
                    return officer.getBadgeNumber();
                }
            }
            if (policeOfficer == null) {
                PoliceOfficerInvalidBadgeNoByRank exception = new PoliceOfficerInvalidBadgeNoByRank("Invalid BadgeNo");
                throw exception;
            }
        }catch (PoliceOfficerInvalidBadgeNoByRank d){
            d.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean getPoliceOfficerOnDutyByPoliceOfficerAge(int policeOfficerAge) {
        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getPoliceOfficerAge() == policeOfficerAge) {
                    return officer.getOnDuty();
                }
            }

            if (policeOfficer == null) {
                PoliceOfficerInvalidOnDutyByAge exception = new PoliceOfficerInvalidOnDutyByAge("Invalid Onduty");
                throw exception;
            }
        }catch (PoliceOfficerInvalidOnDutyByAge ww){
            ww.printStackTrace();
        }
        return false;
    }

    @Override
    public int getPoliceOfficerRankBypoliceOfficerId(int policeOfficerId) {

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getPoliceId() == policeOfficerId) {
                    return officer.getRank();
                }
            }
            if (policeOfficer == null) {
                PoliceOfficerInvalidRankById exception = new PoliceOfficerInvalidRankById("Invalid Rank");
                throw exception;
            }
        }catch (PoliceOfficerInvalidRankById oo){
            oo.printStackTrace();
        }
        return 0;
    }

    @Override
    public void getPoliceOfficerNameByPoliceOfficerRank(int rank) {
        boolean found = false;

        try {
            for (PoliceOfficer officer : policeOfficer) {
                if (officer != null && officer.getRank() == rank) {
                    System.out.println(officer.getOfficerName());
                    found = true;
                }
            }
            if (policeOfficer == null) {
                PoliceOfficerInvalidNameByRank exception = new PoliceOfficerInvalidNameByRank("Invalid Name");
                throw exception;
            }
        }catch (PoliceOfficerInvalidNameByRank vv){
            vv.printStackTrace();
        }
    }
}