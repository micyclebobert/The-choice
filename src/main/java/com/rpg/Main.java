package com.rpg;

import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) {
        initialize();
        
        GUIMenuScreen.start();
    }

    // Must run first
    public static void initialize() {
        Helper.setScreenSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    public static void exit(int status) {
        System.out.println("Exit: " + status);
        System.exit(status);
    }
}