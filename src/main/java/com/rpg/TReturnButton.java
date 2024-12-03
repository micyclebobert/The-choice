package com.rpg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TReturnButton extends JButton {// ←
    public TReturnButton() {
        this.setContentAreaFilled(false);
        this.setBorder(null);
        this.setFocusable(false);
        this.setSize(25, 25);
        this.setLocation(0, 0);
        this.setVerticalAlignment(SwingConstants.BOTTOM);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setBackground(new Color(83, 195, 189));
        this.setForeground(Color.WHITE);
        this.setText("←");
        this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.addActionListener(e -> back());
        this.addMouseListener(new MouseAdapter() {
            @Override
            // Mouse is over the button
            public void mouseEntered(MouseEvent e) {
                onHover();
            }

            @Override
            // Mouse exits the button area
            public void mouseExited(MouseEvent e) {
                afterHover();
            }

        });
    }

    public void back(){
        GUIGameScreen.end();
        GUIMenuScreen.start();
    }
    public void onHover() {
        this.setContentAreaFilled(true);
    }

    public void afterHover() {
        this.setContentAreaFilled(false);
    }

}
