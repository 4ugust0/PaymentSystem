package com.company.models;

import com.company.system.Core;

import java.util.ArrayList;

public class Employee {
    public Employee(String fullName, Address currentAddress, String employeeType, double baseSalary, int paymentDay, String paymentMethod, double unionFee) {
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
        this.serviceChargeArrayList = new ArrayList<ServiceCharge>();
        this.timeCardArrayList = new ArrayList<TimeCard>();

        this.paymentDay = paymentDay;
        this.paymentMethod = paymentMethod;
        this.unionFee = unionFee;

        if(unionFee == 0.00){
            this.belongsUnion = false;
        } else {
            this.belongsUnion = true;
        }
    }

    private String fullName;
    private Address currentAddress;
    private String employeeType;
    private double baseSalary;
    private int employeeID;
    private int paymentDay;
    private String paymentMethod;
    private double unionFee;
    private boolean belongsUnion;

    private ArrayList<Sale> saleArrayList;
    private ArrayList<ServiceCharge> serviceChargeArrayList;
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

    public int getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(int paymentDay) {
        this.paymentDay = paymentDay;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getUnionFee() {
        return unionFee;
    }

    public void setUnionFee(double unionFee) {
        this.unionFee = unionFee;
    }

    public ArrayList<Sale> getSaleArrayList() {
        return saleArrayList;
    }

    public ArrayList<ServiceCharge> getServiceChargeArrayList() {
        return serviceChargeArrayList;
    }

    public ArrayList<TimeCard> getTimeCardArrayList() {
        return timeCardArrayList;
    }

    public boolean isBelongsUnion() {
        return belongsUnion;
    }

    public void setBelongsUnion(boolean belongsUnion) {
        this.belongsUnion = belongsUnion;
    }
}
