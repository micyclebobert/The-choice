package com.rpg;

import javax.swing.JButton;

public class TOptionsButton extends JButton {
    public static final int HEIGHT = 20;

    public TOptionsButton() {
        this.setVisible(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        // this.setBorderPainted(false);
        Helper.setPercentWidth(this, 80);
        Helper.setHeight(this, TOptionsButton.HEIGHT);
        Helper.xCenter(this);
    }
}