package com.xworkz.station;

import com.xworkz.station.officer.PoliceOfficer;
import com.xworkz.station.officer.PoliceStation;
import com.xworkz.station.policestation.PoliceStationImpl;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        System.out.println("\n--- All Police Officers ---");
        policeStation.getPoliceOfficer();

        System.out.print("\nEnter police officer ID to find name: ");
        int searchId = scanner.nextInt();
        String name = policeStation.getPoliceOfficerNameByPoliceOfficerId(searchId);
        System.out.println("Officer name: " + name);

        scanner.nextLine();
        System.out.print("\nEnter police officer name to find department: ");
        String searchName = scanner.nextLine();
        String department = policeStation
                .getPoliceOfficerDepartmentByPoliceOfficerName(searchName);
        System.out.println("Department: " + department);

        System.out.print("\nEnter rank to find badge number: ");
        int searchRank = scanner.nextInt();
        String badgeNumber = policeStation
                .getPoliceOfficerBadgeNumberByPoliceOfficerRank(searchRank);
        System.out.println("Badge number: " + badgeNumber);

        System.out.print("\nEnter age to find duty status: ");
        int searchAge = scanner.nextInt();
        boolean onDuty = policeStation
                .getPoliceOfficerOnDutyByPoliceOfficerAge(searchAge);
        System.out.println("On duty: " + onDuty);

        System.out.print("\nEnter police officer ID to find rank: ");
        int rankId = scanner.nextInt();
        int rank = policeStation.getPoliceOfficerRankBypoliceOfficerId(rankId);
        System.out.println("Rank: " + rank);

        System.out.print("\nEnter rank to find officer names: ");
        int nameRank = scanner.nextInt();
        policeStation.getPoliceOfficerNameByPoliceOfficerRank(nameRank);

        scanner.close();
    }
}