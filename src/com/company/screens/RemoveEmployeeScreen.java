package com.company.screens;

import com.company.models.Employee;
import com.company.system.Core;
import com.company.util.Utility;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;

public class RemoveEmployeeScreen {
    private RemoveEmployeeScreen() {}
    private static RemoveEmployeeScreen singleInstance = new RemoveEmployeeScreen();
    public static RemoveEmployeeScreen getInstance() { return singleInstance; }

    public void startRemoveEmployeeScreen() {
        try{
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

            for (int i = 0; i < employeeArrayList.size(); ++i){
                if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                    employeeArrayList.remove(i);

                    Utility.getInstance().successfulyDone();
                    return;
                }
            }

            Utility.getInstance().printError("Employee id not found, try again");

        } catch (Exception e){
            Utility.getInstance().printError("Choose a valid option", e);
        }
    }
}
