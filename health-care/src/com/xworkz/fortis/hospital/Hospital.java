package com.xworkz.fortis.hospital;

import com.xworkz.fortis.doctor.Doctor;
import com.xworkz.fortis.doctor.HospitalRules;

public class Hospital implements HospitalRules {

    int size;

    private Doctor[] doctors = new Doctor[size];
    int index;

    public void setSize(int size) {
        this.size = size;
        doctors = new Doctor[size];
    }


    @Override
    public void getAllDoctors() {
        System.out.println("Get the doctors name");
    }

    public Doctor getDoctorById(int id) {
        return getDoctorsById(id);
    }

    @Override
    public void getDoctorsInfo() {
        for (Doctor dc : doctors) {
            if (dc != null) {
                System.out.println(dc);
            }
        }
    }

    @Override
    public boolean addDoctor(Doctor doctor) {

        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNamevalid = false;
        boolean isDesignationValid = false;
        boolean isSpecilizationValid = false;
        boolean isExperienceValid = false;
        boolean isFeeValid = false;

        int doctorId = doctor.getDoctorId();

        if (doctorId > 0) {
            isDoctorIdValid = true;
        } else {
            System.out.println("Invalid doctor id");
        }

        String doctorName = doctor.getDoctorName();

        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorNamevalid = true;
        } else {
            System.out.println("Invalid doctor name");
        }

        String designation = doctor.getDesignation();

        if (designation != null && !designation.isEmpty()) {
            isDesignationValid = true;
        } else {
            System.out.println("Invalid designation");
        }

        String[] specialization = doctor.getSpecialization();

        if (specialization != null && specialization.length > 0) {
            isSpecilizationValid = true;
        } else {
            System.out.println("Invalid specialization");
        }

        String experience = doctor.getExperience();

        if (experience != null && !experience.isEmpty()) {
            isExperienceValid = true;
        } else {
            System.out.println("Invalid experience");
        }

        int fee = doctor.getFee();

        if (fee > 0) {
            isFeeValid = true;
        } else {
            System.out.println("Invalid fee");
        }

        if (isDoctorIdValid && isDoctorNamevalid
                && isDesignationValid && isSpecilizationValid
                && isExperienceValid && isFeeValid) {

            if (index < doctors.length) {
                doctors[index++] = doctor;
                isAdded = true;
            } else {
                System.out.println("Hospital doctor list is full");
            }
        }

        return isAdded;
    }

    public Doctor getDoctorsById(int id) {

        Doctor doctorName = null;

        for (Doctor dc : doctors) {
            if (dc != null && id == dc.getDoctorId()) {
                doctorName = dc;
                return doctorName;
            }
        }

        return doctorName;
    }
}