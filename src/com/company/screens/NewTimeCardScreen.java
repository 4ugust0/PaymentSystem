package com.company.screens;

import com.company.models.Date;
import com.company.models.Employee;
import com.company.models.TimeCard;
import com.company.system.Core;
import com.company.util.Utility;

import java.util.ArrayList;

public class NewTimeCardScreen {
    private NewTimeCardScreen() {}
    private static NewTimeCardScreen singleIntance = new NewTimeCardScreen();
    public static NewTimeCardScreen getInstance() { return singleIntance; }

    public void startNewCardScreen() {
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.println("Type the date:");
            System.out.print("Day: ");
            int day = Utility.getInstance().getScanner().nextInt();
            System.out.print("Month: ");
            int month = Utility.getInstance().getScanner().nextInt();
            System.out.print("Year: ");
            int year = Utility.getInstance().getScanner().nextInt();

            Date newDate = new Date(day, month, year);

            System.out.print("Type the hours worked: ");
            int hoursWorked = Utility.getInstance().getScanner().nextInt();

            if(true /*needs to validate the date*/ && hoursWorked > 0) {

                TimeCard newTimeCard = new TimeCard(newDate, hoursWorked);

                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).getTimeCardArrayList().add(newTimeCard);

                        Utility.getInstance().successfulyDone();
                        return;
                    }
                }

                Utility.getInstance().printError("Employee id don't exist");

            } else {
                Utility.getInstance().printError("Invalid entries");
            }

        } catch (Exception e){
            Utility.getInstance().printError("Type only valid entries", e);
        }
    }
}
