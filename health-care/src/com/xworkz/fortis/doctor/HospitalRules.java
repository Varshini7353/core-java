package com.xworkz.fortis.doctor;

public interface HospitalRules {

    boolean addDoctor(Doctor doctor);

    void getAllDoctors();

    Doctor getDoctorById(int id);


    boolean updateDoctorFeesByName(int newFees,String doctorName);

    String[] getSpecilizationbyDoctoryName(String name);
}