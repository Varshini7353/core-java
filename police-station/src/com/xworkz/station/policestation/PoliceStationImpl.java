package com.xworkz.station.policestation;

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

        if (policeOfficer == null) {
            return 0;
        }

        boolean policeIdAdded = policeOfficer.getPoliceId() > 0;

        boolean policeNameAdded = policeOfficer.getOfficerName() != null
                && !policeOfficer.getOfficerName().trim().isEmpty();

        boolean policeDepartmentAdded = policeOfficer.getDepartment() != null
                && !policeOfficer.getDepartment().trim().isEmpty();

        boolean badgeNumberAdded = policeOfficer.getBadgeNumber() != null
                && !policeOfficer.getBadgeNumber().trim().isEmpty();

        boolean policeRankAdded = policeOfficer.getRank() > 0;

        boolean policeOfficerAgeValid = policeOfficer.getPoliceOfficerAge() > 0;

        if (policeIdAdded && policeNameAdded && policeDepartmentAdded
                && badgeNumberAdded && policeRankAdded && policeOfficerAgeValid) {

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
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null) {
                System.out.println(officer);
            } else {
                System.out.println("Police officer not added");
            }
        }
    }

    @Override
    public String getPoliceOfficerNameByPoliceOfficerId(int policeOfficerId) {
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getPoliceId() == policeOfficerId) {
                return officer.getOfficerName();
            }
        }
        return null;
    }

    @Override
    public String getPoliceOfficerDepartmentByPoliceOfficerName(String policeOfficerName) {
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getOfficerName().equalsIgnoreCase(policeOfficerName)) {
                return officer.getDepartment();
            }
        }
        return null;
    }

    @Override
    public String getPoliceOfficerBadgeNumberByPoliceOfficerRank(int policeOfficerRank) {
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getRank() == policeOfficerRank) {
                return officer.getBadgeNumber();
            }
        }
        return null;
    }

    @Override
    public boolean getPoliceOfficerOnDutyByPoliceOfficerAge(int policeOfficerAge) {
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getPoliceOfficerAge() == policeOfficerAge) {
                return officer.getOnDuty();
            }
        }
        return false;
    }

    @Override
    public int getPoliceOfficerRankBypoliceOfficerId(int policeOfficerId) {
        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getPoliceId() == policeOfficerId) {
                return officer.getRank();
            }
        }
        return 0;
    }

    @Override
    public void getPoliceOfficerNameByPoliceOfficerRank(int rank) {
        boolean found = false;

        for (PoliceOfficer officer : policeOfficer) {
            if (officer != null && officer.getRank() == rank) {
                System.out.println(officer.getOfficerName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No police officer found for this rank");
        }
    }
}