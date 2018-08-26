package com.company;

import com.company.screens.MainScreen;
import com.company.util.Utility;
import sun.applet.Main;

public class LoginScreen {
    private static String adminUsername = "jose";
    private static String adminPassword = "augusto";

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

                if(adminUsername.equals(attemptUsername) && adminPassword.equals(attemptPassword)){
                    MainScreen.getInstance().startMainScreen();
                } else {
                    Utility.getInstance().printError("Invalide username or password, try again");
                }
            }

            Utility.getInstance().printError("Closing the program");

        } catch (Exception e){
            Utility.getInstance().printError("Invalid option, try again", e);
        }
    }
}
