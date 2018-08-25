package com.company.models;

public class ServiceTax {
    public ServiceTax(String serviceDescription, String dmyDate, String serviceTime, double taxValue) {
        this.serviceDescription = serviceDescription;
        this.dmyDate = dmyDate;
        this.serviceTime = serviceTime;
        this.taxValue = taxValue;
    }

    private String serviceDescription;
    private String dmyDate;
    private String serviceTime;
    private double taxValue;
}
