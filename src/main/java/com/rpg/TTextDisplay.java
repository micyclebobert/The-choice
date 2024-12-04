package com.rpg;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class TTextDisplay extends JTextArea {
    /* Presetting JTextArea to display multiline text in a nice way */
    public TTextDisplay() {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setOpaque(false);
        this.setEditable(false);
        this.setFocusable(false);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Calibri",Font.BOLD,25));
    }
}
