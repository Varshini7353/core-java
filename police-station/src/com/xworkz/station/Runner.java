package com.xworkz.station;

import com.xworkz.station.officer.PoliceOfficer;
import com.xworkz.station.officer.PoliceStation;
import com.xworkz.station.policestation.PoliceStationImpl;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of police officers: ");
            int size = scanner.nextInt();
            scanner.nextLine();

            if (size <= 0) {
                System.out.println("Enter a valid number");
                scanner.close();
                return;
            }

            PoliceStation policeStation = new PoliceStationImpl(size);

            for (int i = 0; i < size; i++) {

                PoliceOfficer officer = new PoliceOfficer();

                System.out.println("\nEnter details for police officer " + (i + 1));

                System.out.print("Enter police officer ID: ");
                officer.setPoliceId(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter police officer name: ");
                officer.setOfficerName(scanner.nextLine());

                System.out.print("Enter police department: ");
                officer.setDepartment(scanner.nextLine());

                System.out.print("Enter police rank: ");
                officer.setRank(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter police badge number: ");
                officer.setBadgeNumber(scanner.nextLine());

                System.out.print("Is the police officer on duty? (true/false): ");
                officer.setOnDuty(scanner.nextBoolean());

                System.out.print("Enter police officer age: ");
                officer.setPoliceOfficerAge(scanner.nextInt());
                scanner.nextLine();

                int result = policeStation.addPoliceOfficer(officer);

                if (result > 0) {
                    System.out.println("Police officer added successfully!");
                } else {
                    System.out.println("Police officer not added");
                }
            }

            String YesorNo = null;
            do {

                System.out.println("press 1 to getPoliceOfficer");

                System.out.println("Press 2 to getPoliceOfficerNameByPoliceOfficerId");

                System.out.println("Press 3 to getPoliceOfficerDepartmentByPoliceOfficerName ");

                System.out.println("Press 4 to getPoliceOfficerBadgeNumberByPoliceOfficerRank");

                System.out.println("Press 5 to getPoliceOfficerOnDutyByPoliceOfficerAge");

                System.out.println("press 6 to getPoliceOfficerRankBypoliceOfficerId ");

                System.out.println("Press 7 to getPoliceOfficerNameByPoliceOfficerRank");

                int options = scanner.nextInt();
                switch (options) {

                    case 1:
                        System.out.println("\n--- All Police Officers ---");
                        policeStation.getPoliceOfficer();
                        break;

                    case 2:
                        System.out.print("\nEnter police officer ID to find name: ");
                        int searchId = scanner.nextInt();
                        String name = policeStation.getPoliceOfficerNameByPoliceOfficerId(searchId);
                        System.out.println("Officer name: " + name);
                        break;

                    case 3:
                        scanner.nextLine();
                        System.out.print("\nEnter police officer name to find department: ");
                        String searchName = scanner.nextLine();
                        String department = policeStation
                                .getPoliceOfficerDepartmentByPoliceOfficerName(searchName);
                        System.out.println("Department: " + department);
                        break;

                    case 4:
                        System.out.print("\nEnter rank to find badge number: ");
                        int searchRank = scanner.nextInt();
                        String badgeNumber = policeStation
                                .getPoliceOfficerBadgeNumberByPoliceOfficerRank(searchRank);
                        System.out.println("Badge number: " + badgeNumber);
                        break;

                    case 5:
                        System.out.print("\nEnter age to find duty status: ");
                        int searchAge = scanner.nextInt();
                        boolean onDuty = policeStation
                                .getPoliceOfficerOnDutyByPoliceOfficerAge(searchAge);
                        System.out.println("On duty: " + onDuty);
                        break;

                    case 6:
                        System.out.print("\nEnter police officer ID to find rank: ");
                        int rankId = scanner.nextInt();
                        int rank = policeStation.getPoliceOfficerRankBypoliceOfficerId(rankId);
                        System.out.println("Rank: " + rank);
                        break;

                    case 7:
                        System.out.print("\nEnter rank to find officer names: ");
                        int nameRank = scanner.nextInt();
                        policeStation.getPoliceOfficerNameByPoliceOfficerRank(nameRank);
                        break;

                    default:
                        System.out.println("Enter the valid options");


                }
                System.out.println("do you want to continue Y/N");
                YesorNo = scanner.next();
            } while (YesorNo.equalsIgnoreCase("Y"));

        }finally {
            scanner.close();
        }


    }
}