package com.book.bookservice.course;

public class Xworkz {

    public int courseId;
    public String courseName;
    public String duration;
    public double fee;
    public String location;


    @Override
    public boolean equals(Object obj) {
        Xworkz xworkz = (Xworkz) obj;  //down casting


        if (this.courseId == xworkz.courseId && this.courseName.equals(xworkz.courseName)
                && this.duration.equals(xworkz.duration) && this.fee == xworkz.fee &&
                this.location.equals(xworkz.location)) {
            return true;
        }

        return false;
    }

}
