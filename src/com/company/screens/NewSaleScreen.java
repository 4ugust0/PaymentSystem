package com.company.screens;

import com.company.models.Date;
import com.company.models.Employee;
import com.company.models.Sale;
import com.company.models.Time;
import com.company.system.Core;
import com.company.util.Utility;

import java.util.ArrayList;

public class NewSaleScreen {
    private NewSaleScreen() {}
    private static NewSaleScreen singleInstance = new NewSaleScreen();
    public static NewSaleScreen getInstance() { return singleInstance; }

    public void startNewSaleScreen() {
        try {
            Utility.getInstance().clearScreen();
            Utility.getInstance().printHeader();

            System.out.print("Type the employee id: ");
            int employeeID = Utility.getInstance().getScanner().nextInt();

            System.out.println("Type the sale date:");
            System.out.print("Day: ");
            int day = Utility.getInstance().getScanner().nextInt();
            System.out.print("Month: ");
            int month = Utility.getInstance().getScanner().nextInt();
            System.out.print("Year: ");
            int year = Utility.getInstance().getScanner().nextInt();

            Date dmyDate = new Date(day, month, year);

            System.out.println("Type the sale time:");
            System.out.print("Minute: ");
            int minute = Utility.getInstance().getScanner().nextInt();
            System.out.print("Hour: ");
            int hour = Utility.getInstance().getScanner().nextInt();

            Time saleTime = new Time(minute, hour);

            System.out.print("Type the sale value: ");
            double saleValue = Utility.getInstance().getScanner().nextDouble();

            if(true /*needs to validate the date and time*/ && saleValue > 0) {

                Sale newSale = new Sale(dmyDate, saleTime, saleValue);

                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).getSaleArrayList().add(newSale);

                        Utility.getInstance().successfulyDone();
                        return;
                    }
                }

                Utility.getInstance().printError("Employee id not found");

            } else {
                Utility.getInstance().printError("Invalid entries");
            }

        } catch (Exception e){
            Utility.getInstance().printError("Type valid entries", e);
        }
    }
}
