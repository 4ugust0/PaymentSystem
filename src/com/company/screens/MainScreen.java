package com.company.screens;

import com.company.util.Utility;

import java.util.Scanner;

/**
 * Created by alunoic on 24/08/18.
 */
public class MainScreen {
    private MainScreen(){
    }

    private static MainScreen singleInstane = new MainScreen();
    public static  MainScreen getInstance(){
        return singleInstane;
    }

    public void startMainScreen(){
        try{
            Utility.getInstance().clearInterface();
            Utility.getInstance().printHeader();

            System.out.println("0 - Add employee");
            System.out.println("1 - Remove employee");
            System.out.println("2 - New card");
            System.out.println("3 - New sale");
            System.out.println("4 - New service tax");
            System.out.println("5 - Change employee info");
            System.out.println("6 - Run payment sheet");
            System.out.println("7 - Undo/Redo");
            System.out.println("8 - Payment agenda");
            System.out.println("9 - Create new payment agenda");
            System.out.println("10 - Exit");

            int choosedOption = new Scanner(System.in).nextInt();

            switch (choosedOption){
                case 0:

            }

        } catch(Exception e){
            e.printStackTrace();
            Utility.getInstance().printError("Invalid Option, try again");
        }
    }
}
