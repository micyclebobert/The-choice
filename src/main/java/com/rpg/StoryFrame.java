package com.rpg;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class StoryFrame {
    private final String imageLocalPath;
    private final String displayText;
    private final Pair options[];

    /**
     * {@code Pair... options} just means you can input as many {@code Pair}s as you want.<p>
     * It's called varargs (variable arguments)
     */
    public StoryFrame(String imageLocalPath, String displayText, Pair... options) {
        this.imageLocalPath = imageLocalPath;
        this.displayText = displayText;
        this.options = options;
    }
    public ImageIcon getBackground() {
        return Helper.getFullScreenImageIcon(imageLocalPath, Image.SCALE_SMOOTH);
    }


    public String getDisplayText() {
        return displayText;
    }

    public int getOptionsLength() {
        return options.length;
    }

    public String getOptionText(int index) {
        return options[index].getOptionText();
    }

    public ActionListener getOptionAction(int index) {
        return options[index].getOptionAction();
    }
}
