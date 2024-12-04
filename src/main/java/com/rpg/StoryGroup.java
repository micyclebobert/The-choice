package com.rpg;

public abstract class StoryGroup {
    public static void updateFrame(StoryFrame sf) {
        GUIGameScreen.updateFrame(sf);
    }
    public abstract StoryFrame startingFrame();
}
