package com.rpg;

import java.awt.Color;

import javax.swing.JButton;

public class TOptionsButton extends JButton {
    public static final int HEIGHT = 20;

    public TOptionsButton() {
        this.setVisible(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        // this.setBorderPainted(false);
        this.setForeground(Color.WHITE);
        Helper.setPercentWidth(this, 80);
        Helper.setHeight(this, TOptionsButton.HEIGHT);
        Helper.xCenter(this);
    }
}