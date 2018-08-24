package com.company.util;

import java.util.Scanner;

/**
 * Created by alunoic on 24/08/18.
 */
public class Utility {
    private Utility() {
    }

    private static Utility singleInstance = new Utility();
    public static Utility getInstance() {
        return singleInstance;
    }

    public void clearInterface(){
        for(int i = 0; i < 100; ++i){
            System.out.println();
        }
    }

    public void printHeader(){
        System.out.println("--- PAYMENT SYSTEM ---");
        System.out.println();
    }

    public void printError(String errorMessage){
        System.out.println();
        System.out.println(errorMessage);

        new Scanner(System.in).nextLine();
    }
}
