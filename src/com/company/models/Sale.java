package com.company.models;

public class Sale {
    public Sale(Date dmyDate, Time saleTime, double saleValue) {
        this.dmyDate = dmyDate;
        this.saleTime = saleTime;
        this.saleValue = saleValue;
    }

    private Date dmyDate;
    private Time saleTime;
    private double saleValue;

    public Date getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(Date dmyDate) {
        this.dmyDate = dmyDate;
    }

    public Time getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Time saleTime) {
        this.saleTime = saleTime;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }
}
