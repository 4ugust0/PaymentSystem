package com.company.screens;

public class NewCardScreen {
    private NewCardScreen() {}
    private static NewCardScreen singleIntance = new NewCardScreen();
    public static NewCardScreen getInstance() { return singleIntance; }

    public void startNewCardScreen() {

    }
}
