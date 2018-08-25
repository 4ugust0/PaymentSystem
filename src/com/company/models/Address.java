package com.company.models;

public class Address {
    public Address(String cityName, String districtName, String streetName, int houseNumber, String referencePoint) {
        this.cityName = cityName;
        this.districtName = districtName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.referencePoint = referencePoint;
    }

    private String cityName;
    private String districtName;
    private String streetName;
    private int houseNumber;
    private String referencePoint;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }
}
