package com.rpg;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class GUIMenuScreen {
    private static TFullSceenFrame frame;
    private static ImageIcon icon2 = Helper.getImageIcon("/rsz_1boy.jpg");
    private static JLabel textLabel;
    private static TMenuButton button1;
    private static TMenuButton button2;
    private static TMenuButton button3;
    private static JLabel label;

    public static void start() {
        

        textLabel = new JLabel("The Choice", SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 40));
        textLabel.setForeground(Color.WHITE);
        textLabel.setSize(Helper.getScreenWidth(), 50);
        Helper.setPercentY(textLabel, 20);

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100, 0, 500, 500);
        label.setVisible(false);

        button1 = new TMenuButton();
        Helper.setPercentY(button1, 60);
        button1.addActionListener(e -> onButton1Click());
        button1.setText("Start Game");
        button1.setBackground(Color.red);
        button1.setForeground(Color.white);

        button2 = new TMenuButton();
        Helper.setPercentY(button2, 70);
        button2.addActionListener(e -> onButton2Click());
        button2.setText("About us");
        button2.setBackground(Color.blue);
        button2.setForeground(Color.white);

        button3 = new TMenuButton();
        Helper.setPercentY(button3, 80);
        button3.addActionListener(e -> onButton3Click());
        button3.setText("Exit");
        button3.setBackground(Color.blue);
        button3.setForeground(Color.white);

        frame = new TFullSceenFrame(false);

        frame.add(textLabel);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(label);
        frame.setVisible(true);
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
        end();
        GUIEpisodeScreen.start();
    }

    public static void onButton2Click() {
        JOptionPane.showMessageDialog(null, "Iftekhar, Jobayer, Suhrid", "About us", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void onButton3Click() {
        Main.exit(0);
    }

}