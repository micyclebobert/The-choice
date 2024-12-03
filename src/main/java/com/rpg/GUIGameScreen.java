package com.rpg;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;

public class GUIGameScreen {
    private static TFullSceenFrame frame;
    private static JLayeredPane layeredPane;
    private static TTextDisplay displayText;
    private static JLabel imageLabel;
    private static TOptionsButton[] buttons = new TOptionsButton[Constants.MAX_BUTTON_COUNT];

    public final static Integer /* */ BACKGROUND_LAYER = (Integer) (0);
    public final static Integer /*       */ TEXT_LAYER = (Integer) (1);
    public final static Integer /*     */ BUTTON_LAYER = (Integer) (2);

    public static void start(StoryFrame staringStory) {
        frame = new TFullSceenFrame();

        layeredPane = new JLayeredPane();
        Helper.setFullScreen(layeredPane);

        imageLabel = new JLabel();
        Helper.setFullScreen(imageLabel);
        layeredPane.add(imageLabel, BACKGROUND_LAYER);

        for (int i = 0; i < Constants.MAX_BUTTON_COUNT; i++) {
            buttons[i] = new TOptionsButton();
            layeredPane.add(buttons[i], BUTTON_LAYER);
        }

        displayText = new TTextDisplay();
        Helper.setHeight(displayText, 1);
        Helper.setPercentWidth(displayText, 100);
        layeredPane.add(displayText, TEXT_LAYER);

        frame.add(layeredPane);

        updateFrame(staringStory);

        frame.setVisible(true);
    }

    public static void updateFrame(StoryFrame storyFrame) {
        imageLabel.setIcon(storyFrame.getBackground());

        int i = 0;

        for (; i < storyFrame.getOptionsLength(); i++) {

            buttons[i].setVisible(true);
            buttons[i].setText(storyFrame.getOptionText(i));
            for (ActionListener actionListeners : buttons[i].getActionListeners()) {
                // for-each loop through all the actionListeners and remove them
                buttons[i].removeActionListener(actionListeners);
            }

            Helper.setYFromBottom(buttons[i], Constants.BOTTOM_PADDING + ((storyFrame.getOptionsLength() - i - 1)
                    * (Constants.GAP_BETWEEN_BUTTONS + TOptionsButton.HEIGHT)));
            buttons[i].addActionListener(storyFrame.getOptionAction(i));
        }
        for (; i < Constants.MAX_BUTTON_COUNT; i++) {
            buttons[i].setVisible(false);
        }

        displayText.setText(storyFrame.getDisplayText());
        displayText.setSize(displayText.getPreferredScrollableViewportSize());
        Helper.setYFromBottom(displayText, buttons[0].getY() + Constants.TEXT_PADDING);
    }

    public static void end() {
        frame.dispose();
    }
}
