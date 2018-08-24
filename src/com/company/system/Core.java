package com.company.system;

import com.company.models.Employee;

import java.util.ArrayList;

/**
 * Created by alunoic on 24/08/18.
 */
public class Core {
    private Core() {
        this.employeesList = new ArrayList<Employee>();
    }

    private static Core singleInstance = new Core();
    public static Core getInstance() {
        return singleInstance;
    }

    private ArrayList<Employee> employeesList;
}
