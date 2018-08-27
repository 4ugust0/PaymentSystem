package com.company.models;

public class ServiceCharge {
    public ServiceCharge(String serviceDescription, Date dmyDate, Time serviceTime, double chargeValue) {
        this.serviceDescription = serviceDescription;
        this.dmyDate = dmyDate;
        this.serviceTime = serviceTime;
        this.chargeValue = chargeValue;
    }

    private String serviceDescription;
    private Date dmyDate;
    private Time serviceTime;
    private double chargeValue;

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Date getDmyDate() {
        return dmyDate;
    }

    public void setDmyDate(Date dmyDate) {
        this.dmyDate = dmyDate;
    }

    public Time getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Time serviceTime) {
        this.serviceTime = serviceTime;
    }

    public double getChargeValue() {
        return chargeValue;
    }

    public void setChargeValue(double chargeValue) {
        this.chargeValue = chargeValue;
    }
}
