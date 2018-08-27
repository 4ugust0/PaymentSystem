package com.company.system;

import com.company.models.Employee;

import java.util.ArrayList;

public class Core {
    private Core() {
        this.adminUsername = "jose";
        this.adminPassword = "augusto";

        this.employeeArrayList = new ArrayList<Employee>();
    }

    private String adminUsername;
    private String adminPassword;

    private ArrayList<Employee> employeeArrayList;

    private static Core singleInstace = new Core();
    public static Core getInstance() { return singleInstace; }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void listEmployee(){
        for(Employee e : employeeArrayList){
            System.out.println(e);
        }
    }
}