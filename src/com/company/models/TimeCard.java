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
}
