package com.rpg;

import java.awt.event.ActionListener;

public class Pair {
    private final String optionText;
    private final ActionListener optionAction;
    public Pair(String optionText, ActionListener optionAction) {
        this.optionText = optionText;
        this.optionAction = optionAction;
    }
    public String getOptionText() {
        return optionText;
    }
    public ActionListener getOptionAction() {
        return optionAction;
    }
}
