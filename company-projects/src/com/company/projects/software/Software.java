package com.company.projects.software;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Software {

        private int softwareId;
        private String softwareName;
        private String companyName;
        private String developerName;
        private double version;
        private String[] projects;


        public int getSoftwareId() {
            return softwareId;
        }

        public void setSoftwareId(int id){
            softwareId=id;
        }

        public String getSoftwareName(){
            return softwareName;
        }

        public void setSoftwareName(String sName){
            softwareName=sName;
        }

        public String getCompanyName(){
            return companyName;
        }

        public void setCompanyName(String cName){
            companyName=cName;
        }

        public String getDeveloperName(){
            return developerName;
        }

        public void setDeveloperName(String dName){
            developerName=dName;
        }

        public double getVersion(){
            return version;
        }

        public void setVersion(double version){
            this.version=version;
        }

        public String[] getProjects(){
            return projects;
        }

        public void setProjects(String[] projects){
            this.projects=projects;
        }

        @Override
        public String toString(){
           return  "Software-(id= "+this.softwareId+",  sName= "+this.softwareName+" ,cName= "
                   +this.companyName+", dName= "+this.developerName+" , version= "
                   +this.version+", projects= "+ Arrays.toString(this.projects)+")";
        }
}
