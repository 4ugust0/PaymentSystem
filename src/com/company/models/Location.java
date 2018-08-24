package com.company.models;

/**
 * Created by alunoic on 24/08/18.
 */
public class Location {
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getQuarterName() {
        return quarterName;
    }

    public void setQuarterName(String quarterName) {
        this.quarterName = quarterName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }

    public Location(String cityName, String quarterName, String streetName, String houseNumber, String referencePoint) {
        this.cityName = cityName;
        this.quarterName = quarterName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.referencePoint = referencePoint;
    }

    private String cityName;
    private String quarterName;
    private String streetName;
    private String houseNumber;
    private String referencePoint;

}
