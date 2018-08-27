package com.company.screens;

import com.company.system.Core;
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
                System.out.println("1 - Exit");

                int choosedOption = Utility.getInstance().getScanner().nextInt();

                switch (choosedOption){
                    case 0:
                        AddEmployeeScreen.getInstance().startAddEmployeeScreen();
                        break;
                    case 1:
                        return;
                    default:
                        return;
                }
            }

        } catch (Exception e){
            Utility.getInstance().printError("Choose a valid option", e);
        }
    }
}
