package com.book.bookservice.attendance;

public class Attendance {

    public int attendanceId;
    public String employeeName;
    public String date;
    public String checkInTime;
    public String attendanceStatus;


    @Override
    public boolean equals(Object obj){

        Attendance attendance=(Attendance) obj;

        if(this.attendanceId==attendance.attendanceId &&
        this.employeeName.equals(attendance.employeeName) &&
        this.date.equals(attendance.date) &&
        this.checkInTime.equals(attendance.checkInTime) &&
        this.attendanceStatus.equals(attendance.attendanceStatus)) {
            return true;
        }
        return false;
        }
}
