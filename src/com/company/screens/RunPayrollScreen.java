package com.company.screens;

import com.company.models.Employee;
import com.company.models.Sale;
import com.company.models.ServiceCharge;
import com.company.models.TimeCard;
import com.company.system.Core;
import com.company.util.Utility;

import javax.xml.ws.Service;
import java.util.ArrayList;

public class RunPayrollScreen {
    private RunPayrollScreen() {}
    private static RunPayrollScreen singleIntance = new RunPayrollScreen();
    public static RunPayrollScreen getInstance() { return singleIntance; }

    private void payHourlyEmployee(Employee emp){
        double totalSalary = 0;

        ArrayList<TimeCard> timeCardArrayList = emp.getTimeCardArrayList();
        for(int i = timeCardArrayList.size()-1; i >=  Integer.max(0, timeCardArrayList.size()-30); --i){
            totalSalary += ((double)timeCardArrayList.get(i).getHoursWorked()) * emp.getBaseSalary();
        }

        ArrayList<ServiceCharge> serviceChargeArrayList = emp.getServiceChargeArrayList();
        for(int i = serviceChargeArrayList.size()-1; i >= Integer.max(0, serviceChargeArrayList.size()-30); --i){
            totalSalary += serviceChargeArrayList.get(i).getChargeValue();
        }

        if(emp.isUnionMember()){
            totalSalary -= emp.getUnionFee();
        }

        System.out.printf("%s receives %.2f by %s.\n", emp.getFullName(), totalSalary, emp.getPaymentMethod());
    }

    private void payAssalariedEmployee(Employee emp){
        double totalSalary = emp.getBaseSalary();

        ArrayList<ServiceCharge> serviceChargeArrayList = emp.getServiceChargeArrayList();
        for(int i = serviceChargeArrayList.size()-1; i >= Integer.max(0, serviceChargeArrayList.size()-30); --i){
            totalSalary += serviceChargeArrayList.get(i).getChargeValue();
        }

        if(emp.isUnionMember()){
            totalSalary -= emp.getUnionFee();
        }

        System.out.printf("%s receives %.2f %s.\n", emp.getFullName(), totalSalary, emp.getPaymentMethod());
    }

    private void payCommissionedEmployee(Employee emp){
        double totalSalary = emp.getBaseSalary();

        ArrayList<Sale> saleArrayList = emp.getSaleArrayList();
        for(int i = saleArrayList.size()-1; i >= Integer.max(0, saleArrayList.size()-15); --i){
            totalSalary += saleArrayList.get(i).getSaleValue();
        }

        ArrayList<ServiceCharge> serviceChargeArrayList = emp.getServiceChargeArrayList();
        for(int i = serviceChargeArrayList.size()-1; i >= Integer.max(0, serviceChargeArrayList.size()-15); --i){
            totalSalary += serviceChargeArrayList.get(i).getChargeValue();
        }

        if(emp.isUnionMember()){
            totalSalary -= emp.getUnionFee();
        }

        System.out.printf("%s receives %.2f %s.\n", emp.getFullName(), totalSalary, emp.getPaymentMethod());
    }

    public void startRunPayrollScreen() {
        Utility.getInstance().clearScreen();
        Utility.getInstance().printHeader();

        System.out.println("Type the day: ");
        int paymentDay = Utility.getInstance().getScanner().nextInt();

        Utility.getInstance().clearScreen();
        System.out.println("--- Payment ---");

        ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();
        for(Employee emp : employeeArrayList){
            switch (emp.getEmployeeType()){
                case "HOURLY" : { this.payHourlyEmployee(emp); break; }
                case "ASSALARIED" : { payAssalariedEmployee(emp); break; }
                case "COMMISSIONED" : { payCommissionedEmployee(emp); break; }
            }
        }
    }
}
