package com.company.screens;

import com.company.models.Date;
import com.company.models.Employee;
import com.company.models.ServiceCharge;
import com.company.models.Time;
import com.company.system.Core;
import com.company.util.Utility;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

public class NewServiceChargeScreen {
    private NewServiceChargeScreen() {}
    private static NewServiceChargeScreen singleInstance = new NewServiceChargeScreen();
    public static NewServiceChargeScreen getInstance() { return singleInstance; }

    public void startNewServiceChargeScreen() {
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

            Time serviceTime = new Time(minute, hour);

            System.out.print("Type the service charge: ");
            double chargeValue = Utility.getInstance().getScanner().nextDouble();

            System.out.print("Type the service description: ");
            String serviceDescription = Utility.getInstance().getScanner().nextLine();

            if(true /*needs to validate the date and time*/){

                ServiceCharge newServiceCharge = new ServiceCharge(serviceDescription, dmyDate, serviceTime, chargeValue);

                ArrayList<Employee> employeeArrayList = Core.getInstance().getEmployeeArrayList();

                for(int i = 0; i < employeeArrayList.size(); ++i){
                    if(employeeArrayList.get(i).getEmployeeID() == employeeID){
                        employeeArrayList.get(i).getServiceChargeArrayList().add(newServiceCharge);
                    }
                }

                Utility.getInstance().printError("Employee id not found");

            } else {
                Utility.getInstance().printError("Invalid entries");
            }

        } catch (Exception e) {
            Utility.getInstance().printError("Type a valid entry", e);
        }
    }
}
