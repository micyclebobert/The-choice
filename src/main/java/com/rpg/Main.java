package com.rpg;

import java.awt.Toolkit;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {

    public static void main(String[] args) {
        initialize();

        GUIMenuScreen.start();
        playSound();
    }

    // Must run first
    public static void initialize() {
        Helper.setScreenSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    public static void exit(int status) {
        System.out.println("Exit: " + status);
        System.exit(status);
    }

    public static void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new File(Helper.getFullPathURL("/music.wav").toURI()).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
}