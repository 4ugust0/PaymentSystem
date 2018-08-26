package com.company.models;

public class TimeCard {
    public TimeCard(String dmyDate, String inTime, String outTime) {
        this.dmyDate = dmyDate;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    private String dmyDate;
    private String inTime;
    private String outTime;

    public String getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(String dmyDate) {
        this.dmyDate = dmyDate;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }
}
