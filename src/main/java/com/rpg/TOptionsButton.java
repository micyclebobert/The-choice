package com.rpg;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class TOptionsButton extends JButton {
    public static final int HEIGHT = 30;

    public TOptionsButton() {
        this.setVisible(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        // this.setBorderPainted(false);
        this.setFocusable(false);
        this.setForeground(Color.WHITE);
        this.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        Helper.setPercentWidth(this, 45);
        Helper.setHeight(this, TOptionsButton.HEIGHT);
        Helper.setPercentX(this,50);
    }
}