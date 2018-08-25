package com.company.screens;

public class MainScreen {
    private MainScreen() {}
    private static MainScreen singleInstance = new MainScreen();
    public static MainScreen getInstance() { return singleInstance; }

    public void startMainScreen() {

    }
}
