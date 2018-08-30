package com.company.screens;

import com.company.models.Address;
import com.company.models.Employee;
import com.company.system.Core;
import com.company.util.Utility;

import java.util.ArrayList;

public class ChangeEmployeeInfoScreen {
    private ChangeEmployeeInfoScreen() {}
    private static ChangeEmployeeInfoScreen singleInstance = new ChangeEmployeeInfoScreen();
    public static ChangeEmployeeInfoScreen getInstance() { return singleInstance; }

    private static void changeName(){
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.print("Type the new full name: ");
            String newFullName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

            for(int i = 0; i < employeeArrayList.size(); ++i){
                if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                    employeeArrayList.get(i).setFullName(newFullName);

                    Utility.getInstance().successfulyDone();
                    return;
                }
            }

            Utility.getInstance().printError("Employee id not found");

        } catch (Exception e){
            Utility.getInstance().printError("Invalid entries", e);
        }
    }

    private static void changeAddress(){
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.print("New city where the employee lives: ");
            String newCityName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("New istrict: ");
            String newDistrictName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("New street name: ");
            String newStreetName = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("New house number: ");
            int newHouseNumber = Utility.getInstance().getScanner().nextInt();

            System.out.print("New reference point: ");
            String newReferencePoint = Utility.getInstance().getScanner().nextLine().toUpperCase();

            Address newCurrentAddress = new Address(
                    newCityName,
                    newDistrictName,
                    newStreetName,
                    newHouseNumber,
                    newReferencePoint);

            ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

            for(int i = 0; i < employeeArrayList.size(); ++i){
                if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                    employeeArrayList.get(i).setCurrentAddress(newCurrentAddress);

                    Utility.getInstance().successfulyDone();
                    return;
                }
            }

            Utility.getInstance().printError("Employee id not found");

        } catch (Exception e){
            Utility.getInstance().printError("Invalid entries", e);
        }
    }

    private static void changeType(){
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.print("Type the new employee type (hourly, salaried or commissioned): ");
            String newEmployeeType = Utility.getInstance().getScanner().nextLine().toUpperCase();

            System.out.print("Type the new base salary: ");
            double newBaseSalary = Utility.getInstance().getScanner().nextDouble();

            if(newEmployeeType.matches("HOURLY|SALARIED|COMMISSIONED") && newBaseSalary > 0){
                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).setEmployeeType(newEmployeeType);
                        employeeArrayList.get(i).setBaseSalary(newBaseSalary);

                        Utility.getInstance().successfulyDone();
                        return;
                    }
                }

                Utility.getInstance().printError("Employee id not found");
            } else {
                Utility.getInstance().printError("Invalid entries");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid entries", e);
        }
    }

    private static void changePaymentMethod() {
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.print("Type the new payment method (mail, personally or deposit): ");
            String newPaymentMethod = Utility.getInstance().getScanner().nextLine().toUpperCase();

            if(newPaymentMethod.matches("MAIL|PERSONALLY|DEPOSIT")){
                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).setPaymentMethod(newPaymentMethod);

                        Utility.getInstance().successfulyDone();
                        return;
                    }
                }

                Utility.getInstance().printError("Employee id not found");
            } else {
                Utility.getInstance().printError("Invalid entries");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid entries", e);
        }
    }

    private static void changeUnionFee(){
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.print("Type the new union fee (0 for no union): ");
            double newUnionFee = Utility.getInstance().getScanner().nextDouble();

            if(newUnionFee >= 0.00){
                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).setUnionFee(newUnionFee);

                        if(newUnionFee == 0.00){
                            employeeArrayList.get(i).setUnionMember(false);
                        } else {
                            employeeArrayList.get(i).setUnionMember(true);
                        }

                        Utility.getInstance().successfulyDone();
                        return;
                    }
                }

                Utility.getInstance().printError("Employee id not found");
            } else {
                Utility.getInstance().printError("Invalid entries");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid entries", e);
        }
    }

    public void startChangeEmployeeInfoScreen(){
        try{
            while (true) {
                Utility.getInstance().clearScreen();
                Utility.getInstance().printHeader();

                System.out.println("0 - Change name");
                System.out.println("1 - Change address");
                System.out.println("2 - Change type");
                System.out.println("3 - Change payment method");
                System.out.println("4 - Change union fee");
                System.out.println("5 - Exit");

                int choosedOption = Utility.getInstance().getScanner().nextInt();

                switch (choosedOption) {
                    case 0: { changeName(); break; }
                    case 1: { changeAddress(); break; }
                    case 2: { changeType(); break; }
                    case 3: { changePaymentMethod(); break; }
                    case 4: { changeUnionFee(); break; }
                    case 5: { return; }
                    default: { return; }
                }

            }
        } catch (Exception e) {
            Utility.getInstance().printError("Type valid entries", e);
        }
    }
}
