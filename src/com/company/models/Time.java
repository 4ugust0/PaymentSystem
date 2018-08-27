package com.company.models;

public class Time {
    public Time(int minute, int hour){
        this.minute = minute;
        this.hour = hour;
    }

    private int minute;
    private int hour;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
