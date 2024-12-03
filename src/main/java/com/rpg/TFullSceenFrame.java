package com.rpg;

import java.awt.Color;

import javax.swing.JFrame;

public class TFullSceenFrame extends JFrame {
    public TFullSceenFrame() {
        this(true);
    }

    public TFullSceenFrame(Boolean allowReturn) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);// Set the frame to full screen
        this.setUndecorated(true); // Remove title bar for true full-screen experience
        this.getContentPane().setBackground(new Color(32, 28, 28));
        this.setLayout(null);
        this.setTitle(Constants.TITLE);
        this.setIconImage(Helper.getImage("/projcet.png"));
    
        this.add(new TCloseButton());
        if (allowReturn)
            this.add(new TReturnButton());
    }

}
