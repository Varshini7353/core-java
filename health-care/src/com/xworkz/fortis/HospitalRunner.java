package com.xworkz.fortis;

import com.xworkz.fortis.doctor.Doctor;
import com.xworkz.fortis.hospital.Hospital;

import java.security.SecureRandom;
import java.util.Scanner;

public class HospitalRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter how many doctors you want to add: ");
            int size = sc.nextInt();
            sc.nextLine();

            if (size <= 0) {
                System.out.println("Please enter a valid number of doctors.");
                sc.close();
                return;
            }

            Hospital hospital = new Hospital(size);


            for (int i = 0; i < size; i++) {

                System.out.println("\nEntering details for Doctor " + (i + 1));

                Doctor newDoctor = new Doctor();

                System.out.print("Enter the doctor ID: ");
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
                String specializationInput = sc.nextLine();
                String[] specializations = specializationInput.split(",");
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
            String YesOrNo = null;
            do {


                System.out.println("press 1 to getAllDoctors");

                System.out.println("Press 2 to getDoctorById");

                System.out.println("press 3 to updateDoctorFeesByName");

                System.out.println("Press 4 to getSpecilizationbyDoctorName");


                int options = sc.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("\n--- Final List of All Doctors ---");
                        hospital.getAllDoctors();
                        break;


                    case 2:
                        System.out.print("\nEnter doctor ID to search: ");
                        int searchId = sc.nextInt();
                        sc.nextLine();
                        Doctor doctor = hospital.getDoctorById(searchId);
                        System.out.println(doctor);
                        break;

                    case 3:
                        System.out.println("Enter the doctorName");
                        boolean newFees = hospital.updateDoctorFeesByName(1700, "Amith javed");
                        System.out.println(newFees);
                        break;


                    case 4:
                        System.out.println("The specilizations for the given Doctor:");
                        String[] speclizations = hospital.getSpecilizationbyDoctoryName("ee");
                        for (String speclization : speclizations) {
                            System.out.println(speclization);
                        }
                        break;


                    default:
                        System.out.println("Enter the valid options");


                }
                System.out.println("do you want to continue Y/N");
                YesOrNo = sc.next();
            } while (YesOrNo.equalsIgnoreCase("Y"));


            sc.nextLine();
            System.out.print("\nEnter doctor name to update consultation fee: ");
            String updateName = sc.nextLine();

            System.out.print("Enter the new consultation fee: ");
            int newFee = sc.nextInt();

        }finally {
            sc.close();
        }

    }
}
