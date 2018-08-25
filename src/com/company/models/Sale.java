package com.company.models;

public class Sale {
    public Sale(String dmyDate, String saleTime, double saleValue) {
        this.dmyDate = dmyDate;
        this.saleTime = saleTime;
        this.saleValue = saleValue;
    }

    private String dmyDate;
    private String saleTime;
    private double saleValue;

    public String getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(String dmyDate) {
        this.dmyDate = dmyDate;
    }

    public String getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(String saleTime) {
        this.saleTime = saleTime;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }
}
