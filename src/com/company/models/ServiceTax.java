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

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(String dmyDate) {
        this.dmyDate = dmyDate;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }
}
