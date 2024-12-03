package com.rpg;

import java.awt.Font;

import javax.swing.JTextArea;

public class TTextDisplay extends JTextArea {
    /* Presetting JTextArea to display multiline text in a nice way */
    public static final int X =10;
    public TTextDisplay() {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setOpaque(false);
        this.setEditable(false);
        this.setFocusable(false);
        this.setFont(new Font(Font.SERIF,Font.BOLD,14));
        Helper.setX(this, X);
    }
}
