package com.company.models;

public class TimeCard {
    public TimeCard (Date dmyDate, int hoursWorked){
        this.dmyDate = dmyDate;
        this.hoursWorked = hoursWorked;
    }

    private Date dmyDate;
    private int hoursWorked;

    public Date getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(Date dmyDate) {
        this.dmyDate = dmyDate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
