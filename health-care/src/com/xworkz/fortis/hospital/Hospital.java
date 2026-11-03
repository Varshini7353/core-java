package com.xworkz.fortis.hospital;

import com.xworkz.fortis.doctor.Doctor;
import com.xworkz.fortis.doctor.HospitalRules;
import com.xworkz.fortis.exception.DoctorInvalidException;
import com.xworkz.fortis.exception.DoctorNotFoundException;
import com.xworkz.fortis.exception.DoctorSpeclizationNotFoundException;

public class Hospital implements HospitalRules {

    int size;

    private Doctor[] doctors = new Doctor[size];
    int index;

    public Hospital(int size) {
        this.size = size;
        doctors = new Doctor[size];
    }


    @Override
    public void getAllDoctors() {
        try {
            for (Doctor dc : doctors) {
                if (dc != null) {
                    dc.getDoctorName();
                    System.out.println(dc);
                }
            }

            if (doctors.length == 0) {
                DoctorNotFoundException exception1 = new DoctorNotFoundException("Sorry...Doctor not found");
                throw exception1;
            }
        } catch (DoctorNotFoundException ee) {
            ee.printStackTrace();

        }
    }

    @Override
    public boolean updateDoctorFeesByName(int newFees, String doctorName) {

        boolean isDoctorFeesUpdated = false;

        for (Doctor doctor : doctors) {
            try {
                doctor.getDoctorName(); // Generates NullPointerException

                if (doctor.getDoctorName().equals(doctorName)) {
                    doctor.setFee(newFees);
                    isDoctorFeesUpdated = true;
                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("Provide correct input");
            }
        }

        return isDoctorFeesUpdated;
    }

    @Override
    public String[] getSpecilizationbyDoctoryName(String name) {

        String[] specializations = null;
        try {
            for (Doctor dc : doctors) {
                if (name.equals(dc.getDoctorName())) {
                    specializations = dc.getSpecialization();
                }
            }

            if (specializations == null) {
                DoctorSpeclizationNotFoundException exception = new DoctorSpeclizationNotFoundException("Sorry speclizations not found");
                throw exception;
            }
        } catch (DoctorSpeclizationNotFoundException ee) {
            ee.printStackTrace();
        }
        return specializations;
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
        } else System.out.println("Invalid doctor id");

        String doctorName = doctor.getDoctorName();
        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorNamevalid = true;
        } else System.out.println("Invalid doctor name");

        String designation = doctor.getDesignation();
        if (designation != null && !designation.isEmpty()) {
            isDesignationValid = true;
        } else System.out.println("Invalid designation");


        String[] specialization = doctor.getSpecialization();
        if (specialization != null && specialization.length > 0) {
            isSpecilizationValid = true;
        } else System.out.println("Invalid specialization");

        String experience = doctor.getExperience();
        if (experience != null && !experience.isEmpty()) {
            isExperienceValid = true;
        } else System.out.println("Invalid experience");


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

    public Doctor getDoctorById(int id) {

        Doctor doctorName = null;
        System.out.println("invoked getDoctorbyid");

        try {

            for (Doctor dc : doctors) {
                if (dc != null && id == dc.getDoctorId()) {
                    doctorName = dc;
                    return doctorName;
                }
            }

            if (doctors == null) {
                DoctorInvalidException exception = new DoctorInvalidException("Sorry... Doctor not available");
                throw exception;
            }

        }catch(DoctorInvalidException jfk){
            jfk.printStackTrace();


        }

        return doctorName;
    }

}