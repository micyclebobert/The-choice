package com.rpg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class TCloseButton extends JButton {
    public final static int WIDTH = 25;
    public final static int HEIGHT = 25;

    public TCloseButton() {
        this.setContentAreaFilled(false);
        this.setBorder(null);
        this.setFocusable(false);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(0, 0);
        Helper.setXFromRight(this, 0);
        this.setBackground(Color.RED);
        this.setForeground(Color.WHITE);
        this.setText("X");
        this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        this.addActionListener(e -> Main.exit(2));
        this.addMouseListener(new MouseAdapter() {
            @Override
            //Mouse is over the button
            public void mouseEntered(MouseEvent e) {
                onHover();
            }

            @Override
            //Mouse exits the button area
            public void mouseExited(MouseEvent e) {
                afterHover();
            }

        });
    }

    public void onHover() {
        this.setContentAreaFilled(true);
    }

    public void afterHover() {
        this.setContentAreaFilled(false);
    }
}
