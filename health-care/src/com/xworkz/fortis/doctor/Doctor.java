package com.xworkz.fortis.doctor;

import java.util.Arrays;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private String designation;
    private String[] specialization;
    private String experience;
    private int fee;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int id) {
        doctorId = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String name) {
        doctorName = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String des) {
        designation = des;
    }

    public String[] getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String[] specializations) {
        specialization = specializations;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String exp) {
        experience = exp;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fees) {
        fee = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", designation='" + designation + '\'' +
                ", specialization=" + Arrays.toString(specialization) +
                ", experience='" + experience + '\'' +
                ", fee=" + fee +
                '}';
    }
}