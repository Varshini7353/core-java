package com.company.projects;

import com.company.projects.coampny.Company;
import com.company.projects.software.Software;

import java.util.logging.SocketHandler;

public class ComapnyRunner {

    public static void main(String[] args) {

        Company company=new Company();
        String[] amazonProjects = {"Amazon Website", "Payment System", "Inventory System", "Delivery System"};
        String[] projects2 = {"Online Banking", "Fund Transfer", "Bill Payment", "Transaction System"};
        String[] projects3 = {"Patient Management", "Appointment System", "Billing System", "Pharmacy System"};
        String[] projects4 = {"Employee Records", "Payroll System", "Attendance System", "Leave Management"};
        String[] projects5 = {"Flight Booking", "Hotel Booking", "Payment Gateway", "Travel Management"};
        String[] projects6 = {"Food Ordering", "Restaurant Management", "Online Payment", "Delivery Tracking"};
        String[] projects7 = {"Student Registration", "Exam Management", "Attendance", "Result Management"};
        String[] projects8 = {"Movie Booking", "Seat Selection", "Online Payment", "Ticket Management"};
        String[] projects9 = {"Product Management", "Customer Management", "Order Tracking", "Payment System"};


        Software software=new Software();
        software.setSoftwareId(1);
        software.setSoftwareName("Amazon");
        software.setCompanyName("Amazon");
        software.setDeveloperName("John");
        software.setVersion(2.5);
        software.setProjects(amazonProjects);

        Software software1=new Software();
        software1.setSoftwareId(2);
        software1.setSoftwareName("Banking software");
        software1.setCompanyName("Infosys");
        software1.setDeveloperName("Rahul");
        software1.setVersion(3.5);
        software1.setProjects(projects2);

        Software software2=new Software();
        software2.setSoftwareId(3);
        software2.setSoftwareName("Hospital Management");
        software2.setCompanyName("TCS");
        software2.setDeveloperName("Abhay");
        software2.setVersion(4.5);
        software2.setProjects(projects3);

        Software software3=new Software();
        software3.setSoftwareId(4);
        software3.setSoftwareName("Employee Management");
        software3.setCompanyName("Wipro");
        software3.setDeveloperName("Akash");
        software3.setVersion(2.9);
        software3.setProjects(projects4);

        Software software4=new Software();
        software4.setSoftwareId(5);
        software4.setSoftwareName("Travel Management");
        software4.setCompanyName("Accenture");
        software4.setDeveloperName("Arun");
        software4.setVersion(3.9);
        software4.setProjects(projects5);

        Software software5=new Software();
        software5.setSoftwareId(6);
        software5.setSoftwareName("Food Delivery");
        software5.setCompanyName("Tech Mahendra");
        software5.setDeveloperName("Darshan");
        software5.setVersion(3.6);
        software5.setProjects(projects6);

        Software software6=new Software();
        software6.setSoftwareId(7);
        software6.setSoftwareName("Student Management");
        software6.setCompanyName("HCL");
        software6.setDeveloperName("Darshan");
        software6.setVersion(5.9);
        software6.setProjects(projects7);

        Software software7=new Software();
        software7.setSoftwareId(7);
        software7.setSoftwareName("Movie Booking");
        software7.setCompanyName("Cognizant");
        software7.setDeveloperName("Sneha");
        software7.setVersion(4.7);
        software7.setProjects(projects8);

        Software software8=new Software();
        software8.setSoftwareId(8);
        software8.setSoftwareName("Ecommerce");
        software8.setCompanyName("Capgemini");
        software8.setDeveloperName("Sreeeram");
        software8.setVersion(3.7);
        software8.setProjects(projects9);



        company.addProjects(software);
        company.addProjects(software1);
        company.addProjects(software2);
        company.addProjects(software3);
        company.addProjects(software4);
        company.addProjects(software5);
        company.addProjects(software6);
        company.addProjects(software7);
        company.addProjects(software8);
        company.getProjectInfo();

    }



}
