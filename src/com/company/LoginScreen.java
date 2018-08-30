package com.company;

import com.company.screens.UndoRedoScreen;
import com.company.system.Core;
import com.company.util.Utility;

public class LoginScreen {
    public static void main(String[] args) {
        try{
            int errorCounter = 0;
            while(errorCounter++ < 3){
                Utility.getInstance().clearScreen();
                Utility.getInstance().printHeader();

                System.out.print("Login: ");
                String attemptUsername = Utility.getInstance().getScanner().nextLine();
                System.out.print("Password: ");
                String attemptPassword = Utility.getInstance().getScanner().nextLine();

                if(Core.getInstance().getAdminUsername().equals(attemptUsername) && Core.getInstance().getAdminPassword().equals(attemptPassword)){
                    errorCounter = 0;

                    Utility.getInstance().successfulyDone();

                    UndoRedoScreen.MainScreen.getInstance().startMainScreen();
                } else {
                    Utility.getInstance().printError("Invalid username or password, try again");
                }
            }

            Utility.getInstance().printError("Closing the program");

        } catch (Exception e){
            Utility.getInstance().printError("Invalid option, try again", e);
        }
    }
}
