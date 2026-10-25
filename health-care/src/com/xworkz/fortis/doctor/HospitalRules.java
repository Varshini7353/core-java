package com.xworkz.fortis.doctor;

public interface HospitalRules {

    boolean addDoctor(Doctor doctor);

    void getAllDoctors();

    Doctor getDoctorById(int id);

    void getDoctorsInfo();
}