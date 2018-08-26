package com.company.util;

import java.util.Scanner;

public class Utility {
    private Utility() {}
    private static Utility singleIntance = new Utility();
    public static Utility getInstance() { return singleIntance; }

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void clearScreen(){
        for(int i = 0; i < 100; i++){
            System.out.println();
        }
    }

    public void printHeader() {
        System.out.println();
        System.out.println("--- PAYMENTSHEET ---");
        System.out.println();
    }

    public void printError(String errorMessage) {
        System.out.println();
        System.out.println(errorMessage);
        System.out.println();

        this.getScanner().nextLine();
    }

    public void printError(String errorMessage, Exception e) {
        System.out.println();
        System.out.println(errorMessage);
        System.out.println();

        e.printStackTrace();
        System.out.println();

        this.getScanner().nextLine();
    }
}
