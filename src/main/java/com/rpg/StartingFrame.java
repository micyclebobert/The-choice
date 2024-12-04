package com.rpg;

public class StartingFrame extends StoryGroup {
    

    public static StoryFrame firstFrame() {
        Pair pair1 = new Pair("Go to market", e -> updateFrame(firstFrame()));
        Pair pair2 = new Pair("Do chores", e -> System.out.println("Helo Helo"));
        return new StoryFrame("/Example/1.png", "A murder happen", pair1, pair2);
    }



    @Override
    public StoryFrame startingFrame() {
        return firstFrame();
    }

}
