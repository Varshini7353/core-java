package com.company.projects.coampny;

import com.company.projects.software.Software;

public class Company {

    private Software[] softwares = new Software[9];
    int index;


    public boolean addProjects(Software software) {
        boolean isAdded = false;

        boolean isProjectIdValid = false;
        boolean isSoftwareNameValid = false;
        boolean isCompanyNameValid = false;
        boolean isDeveloperNameValid = false;
        boolean isVersionValid = false;
        boolean isProjectValid = false;

        int projectId = software.getSoftwareId();
        if (projectId > 0) {
            isProjectIdValid = true;
        } else System.out.println("Invalid project id");

        String softwareName = software.getSoftwareName();
        if (softwareName != null && !softwareName.isEmpty()) {
            isSoftwareNameValid = true;
        } else System.out.println("Invalid softwareName");

        String companyName = software.getCompanyName();
        if (companyName != null && !companyName.isEmpty()) {
            isCompanyNameValid = true;
        } else System.out.println("Invalid company name");

        String developerName = software.getDeveloperName();
        if (developerName != null && !developerName.isEmpty()) {
            isDeveloperNameValid = true;
        } else System.out.println("Invalid developer name");

        double version = software.getVersion();
        if (version > 0) {
            isVersionValid = true;
        } else System.out.println("Invalid version");

        String[] projects = software.getProjects();
        if (projects != null && projects.length > 0) {
            isProjectValid = true;
        } else System.out.println("Invalid projects");

        if (isProjectValid && isSoftwareNameValid && isCompanyNameValid && isDeveloperNameValid &&
                isVersionValid && isProjectValid) {
            softwares[index++] = software;
            isAdded = true;
        }
        return isAdded;
    }

    public void getProjectInfo(){

        for (Software software:softwares){
            System.out.println(software);
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }
}
