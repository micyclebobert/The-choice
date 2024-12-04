package com.rpg;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class StoryFrame {
    private final String displayText;
    private final Pair options[];

    /**
     * {@code Pair... options} just means you can input as many {@code Pair}s as you
     * want.
     * <p>
     * It's called varargs (variable arguments)
     */
    public StoryFrame(String displayText, Pair... options) {
        this.displayText = displayText;
        this.options = options;
    }

    public ImageIcon getBackground() {

        return null;
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
