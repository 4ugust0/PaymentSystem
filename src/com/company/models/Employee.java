package com.company.models;

import java.util.ArrayList;

/**
 * Created by alunoic on 24/08/18.
 */
public class Employee {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Location getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Location currentAddress) {
        this.currentAddress = currentAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public Employee (String fullName, Location currentAddress, String employeeType, int idNumber) {
        this.fullName = fullName;
        this.currentAddress = currentAddress;
        this.employeeType = employeeType;
        this.idNumber = idNumber;
        this.cardsList = new ArrayList<Card>();
    }

    private String fullName;
    private Location currentAddress;
    private int idNumber;
    private String employeeType;
    private ArrayList<Card> cardsList;
}
