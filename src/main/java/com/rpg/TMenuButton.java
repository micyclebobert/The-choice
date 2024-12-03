package com.rpg;

import javax.swing.JButton;

public class TMenuButton extends JButton {

    public TMenuButton() {
        this.setSize(100, 30);
        this.setFocusable(false);
        Helper.xCenter(this);
    }

    public TMenuButton(int y) {
        this();
        Helper.setY(this, y);
    }
}
