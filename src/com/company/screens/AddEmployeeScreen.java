package com.company.screens;

import com.company.models.Address;
import com.company.models.Employee;
import com.company.system.Core;
import com.company.util.Utility;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.EnumMap;

public class AddEmployeeScreen {
    private AddEmployeeScreen() {}
    private static AddEmployeeScreen singleInstance = new AddEmployeeScreen();
    public static AddEmployeeScreen getInstance() { return singleInstance; }

    public void startAddEmployeeScreen() {
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the full name: ");
            String fullName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("City where the employee lives: ");
            String cityName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("District: ");
            String districtName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("Street name: ");
            String streetName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("House number: ");
            int houseNumber = Utility.getInstance().getScanner().nextInt();

            System.out.print("Reference point: ");
            String referencePoint = Utility.getInstance().getScanner().nextLine().toUpperCase();

            Address currentAddress = new Address(
                    cityName,
                    districtName,
                    streetName,
                    houseNumber,
                    referencePoint);

            System.out.print("Hourly, salaried or commissioned: ");
            String employeeType = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("Type the base salary: ");
            double baseSalary = Utility.getInstance().getScanner().nextDouble();

            System.out.print("Type the payment day: ");
            int paymentDay = Utility.getInstance().getScanner().nextInt();

            System.out.print("Payment method(mail, personally or deposit): ");
            String paymentMethod = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("Union fee: ");
            double unionFee = Utility.getInstance().getScanner().nextDouble();

            if(paymentMethod.matches("MAIL|PERSONALLY|DEPOSIT") &&
                    employeeType.matches("HOURLY|SALARIED|COMMISSIONED") &&
                    unionFee >= 0 &&
                    baseSalary > 0 && houseNumber >= 0 &&
                    paymentDay > 0 && paymentDay < 29) {

                Employee newEmployee = new Employee(
                        fullName,
                        currentAddress,
                        employeeType,
                        baseSalary,
                        paymentDay,
                        paymentMethod,
                        unionFee);

                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                employeeArrayList.add(newEmployee);

                Utility.getInstance().successfulyDone();

            } else {
                Utility.getInstance().printError("Type valid entries only");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Type valid entries only", e);
        }

    }
}
