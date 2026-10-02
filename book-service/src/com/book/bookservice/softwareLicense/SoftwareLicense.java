package com.book.bookservice.softwareLicense;

public class SoftwareLicense {


    public int licenseId;
    public String softwareName;
    public String licenseType;
    public String expiryDate;
    public String licenseKey;



    @Override
    public boolean equals(Object obj){
        SoftwareLicense license=(SoftwareLicense) obj;

        if(this.licenseId==license.licenseId &&
        this.softwareName.equals(license.softwareName) &&
        this.licenseType.equals(license.licenseType) &&
        this.expiryDate.equals(license.expiryDate) &&
        this.licenseKey==license.licenseKey){

            return true;
        }
        return false;
    }
}
