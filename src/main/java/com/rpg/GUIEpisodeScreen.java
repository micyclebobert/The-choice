package com.rpg;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUIEpisodeScreen {

    private static TFullSceenFrame frame;
    private static ImageIcon icon2 = Helper.getImageIcon("/rsz_1boy.jpg");
    private static TMenuButton button1;
    private static TMenuButton button2;
    private static TMenuButton button3;
    private static JLabel label;

    public static void start() {
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100, 0, 500, 500);
        label.setVisible(false);

        button1 = new TMenuButton();
        Helper.setPercentY(button1, 50);
        button1.addActionListener(e -> onButton1Click());
        button1.setText("Episode 1");

        button2 = new TMenuButton();
        Helper.setPercentY(button2, 60);
        button2.addActionListener(e -> onButton2Click());
        button2.setText("Episode 2");

        button3 = new TMenuButton();
        Helper.setPercentY(button3, 70);
        button3.addActionListener(e -> onButton3Click());
        button3.setText("Episode 3");

        frame = new TFullSceenFrame(false);

        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(label);
    }
    
    public static void end() {
        frame.dispose();
    }

    public static void onButton1Click() {
        end();
        GUIPlayerSelectScreen.start();
    }

    public static void onButton2Click() {
    }

    public static void onButton3Click() {
    }

    public static void startGame() {
    }

}