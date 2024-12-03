package com.rpg;

public class StoryGroupExample extends StoryGroup {

    public static StoryFrame atHome() {
        Pair pair1 = new Pair("Go to market", e -> updateFrame(market()));
        Pair pair2 = new Pair("Go to job", e -> System.out.println("Helo Helo"));
        return new StoryFrame("/1.png", "What would you like to do?", pair1, pair2);
    }

    public static StoryFrame atJob() {
        Pair pair1 = new Pair("Go Home", e -> updateFrame(atHome()));
        return new StoryFrame("/3.jpg", "Job over", pair1);
    }

    public static StoryFrame market() {
        Pair pair1 = new Pair("Fight", e -> updateFrame(win()));
        return new StoryFrame("/2.jpg", "Enemy appeared", pair1);
    }

    public static StoryFrame win() {
        Pair pair1 = new Pair("Go Home", e -> updateFrame(atHome()));
        return new StoryFrame("/3.jpg", "You won", pair1);
    }

    public StoryFrame startingFrame() {
        return atHome();
    }
}
