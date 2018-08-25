package com.company.system;

import com.company.models.Employee;

import java.util.ArrayList;

public class Core {
    private Core() {
        this.employeeArrayList = new ArrayList<Employee>();
    }

    private ArrayList<Employee> employeeArrayList;

    private static Core singleInstace = new Core();
    public static Core getInstance() { return singleInstace; }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }
}
