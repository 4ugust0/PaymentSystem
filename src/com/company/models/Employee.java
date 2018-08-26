package com.company.models;

import com.company.system.Core;

import java.util.ArrayList;

public class Employee {
    public Employee(String fullName, Address currentAddress, String employeeType, double baseSalary) {
        this.fullName = fullName;
        this.currentAddress = currentAddress;
        this.employeeType = employeeType;
        this.baseSalary = baseSalary;

        ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

        if(employeeArrayList.size() == 0){
            this.employeeID = 1;
        } else{
            this.employeeID = employeeArrayList.get(employeeArrayList.size() - 1).getEmployeeID() + 1;
        }

        this.saleArrayList = new ArrayList<Sale>();
        this.serviceTaxArrayList = new ArrayList<ServiceTax>();
        this.timeCardArrayList = new ArrayList<TimeCard>();
    }

    private String fullName;
    private Address currentAddress;
    private String employeeType;
    private double baseSalary;
    private int employeeID;

    private ArrayList<Sale> saleArrayList;
    private ArrayList<ServiceTax> serviceTaxArrayList;
    private ArrayList<TimeCard> timeCardArrayList;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void addSale() {}
    public void addServiceTax() {}
    public void addTimeCard() {}
}
