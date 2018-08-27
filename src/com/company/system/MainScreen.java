package com.company.system;

import com.company.screens.*;
import com.company.screens.ChangeEmployeeInfoScreen;
import com.company.util.Utility;

public class MainScreen {
    private MainScreen() {}
    private static MainScreen singleInstance = new MainScreen();
    public static MainScreen getInstance() { return singleInstance; }

    public void startMainScreen() {
        try {
            while(true){
                Utility.getInstance().clearScreen();
                Utility.getInstance().printHeader();

                System.out.println("0 - Add employee");
                System.out.println("1 - Remove employee");
                System.out.println("2 - New time card");
                System.out.println("3 - New sale");
                System.out.println("4 - New service charge");
                System.out.println("5 - Change employee info");
                System.out.println("6 - Run payroll");

                int choosedOption = Utility.getInstance().getScanner().nextInt();

                switch (choosedOption){
                    case 0: { AddEmployeeScreen.getInstance().startAddEmployeeScreen(); break; }
                    case 1: { RemoveEmployeeScreen.getInstance().startRemoveEmployeeScreen(); break; }
                    case 2: { NewTimeCardScreen.getInstance().startNewCardScreen(); break; }
                    case 3: { NewSaleScreen.getInstance().startNewSaleScreen(); break; }
                    case 4: { NewServiceChargeScreen.getInstance().startNewServiceChargeScreen(); break; }
                    case 5: { ChangeEmployeeInfoScreen.getInstance().startChangeEmployeeInfoScreen(); break; }
                    case 6: { RunPayrollScreen.getInstance().startRunPayrollScreen(); break; }
                    default: { return; }
                }
            }

        } catch (Exception e){
            Utility.getInstance().printError("Choose a valid option", e);
        }
    }
}
