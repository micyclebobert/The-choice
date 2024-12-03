package com.rpg;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUIMenuScreen {
    private static TFullSceenFrame frame;
    private static ImageIcon icon2 = Helper.getImageIcon("/rsz_1boy.jpg");
    private static TMenuButton button1;
    private static TMenuButton button2;
    private static JLabel label;
    private static StoryGroup group;

    public static void start() {
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100, 0, 500, 500);
        label.setVisible(false);

        button1 = new TMenuButton();
        Helper.setY(button1, 300);
        button1.addActionListener(e -> onButton1Click());
        button1.setText("Choose A");
        button1.setBackground(Color.red);
        button1.setForeground(Color.white);

        button2 = new TMenuButton();
        Helper.setY(button2, 400);
        button2.addActionListener(e -> onButton2Click());
        button2.setText("Choose B");
        button2.setBackground(Color.blue);
        button2.setForeground(Color.white);

        frame = new TFullSceenFrame(false);

        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(label);
    }

    /**
     * After frame is set to visible
     * you should use this if you make
     * any major change
     */
    public static void updateFrame() {
        frame.revalidate();
        frame.repaint();
    }

    public static void end() {
        frame.dispose();
    }

    public static void onButton1Click() {
        frame.remove(button2);
        frame.remove(button1);
        label.setVisible(true);
        updateFrame();
    }

    public static void onButton2Click() {
        System.out.println("Nice to meet you");
        group = new StoryGroupExample();
        startGame();
    }

    public static void startGame() {
        end();
        GUIGameScreen.start(group.startingFrame());
    }

}