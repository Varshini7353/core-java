package com.xworkz.fortis;

import com.xworkz.fortis.doctor.Doctor;
import com.xworkz.fortis.hospital.Hospital;

import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many doctors you want to add: ");
        int size = sc.nextInt();
        sc.nextLine();

        if (size <= 0) {
            System.out.println("Please enter a valid number of doctors.");
            sc.close();
            return;
        }

        Hospital hospital = new Hospital();
        hospital.setSize(size);

        for (int i = 0; i < size; i++) {

            System.out.println("\nEntering details for Doctor " + (i + 1));

            Doctor newDoctor = new Doctor();

            System.out.print("Enter the doctor id: ");
            int doctorId = sc.nextInt();
            sc.nextLine();
            newDoctor.setDoctorId(doctorId);

            System.out.print("Enter the doctor name: ");
            String doctorName = sc.nextLine();
            newDoctor.setDoctorName(doctorName);

            System.out.print("Enter the designation: ");
            String designation = sc.nextLine();
            newDoctor.setDesignation(designation);

            System.out.println("Enter specializations separated by commas:");
            String specilization = sc.nextLine();
            String[] specializations = specilization.split(",");
            newDoctor.setSpecialization(specializations);

            System.out.print("Enter experience: ");
            String experience = sc.nextLine();
            newDoctor.setExperience(experience);

            System.out.print("Enter consultation fee: ");
            int fee = sc.nextInt();
            sc.nextLine();
            newDoctor.setFee(fee);

            boolean added = hospital.addDoctor(newDoctor);

            if (added) {
                System.out.println("Doctor added successfully!");
            } else {
                System.out.println("Failed to add doctor due to validation rules.");
            }
        }

        System.out.print("\nEnter doctor ID to search: ");
        int searchId = sc.nextInt();

        Doctor doctor = hospital.getDoctorById(searchId);

        if (doctor != null) {
            System.out.println("Doctor found: " + doctor);
        } else {
            System.out.println("Doctor not found");
        }

        System.out.println("\n--- Final List of All Doctors ---");
        hospital.getDoctorsInfo();

        sc.close();
    }
}