package com.rpg;

public class StoryGroupExample extends StoryGroup {

    public static StoryFrame atHome() {
        Pair pair1 = new Pair("Go to market", e -> updateFrame(market()));
        Pair pair2 = new Pair("Do chores", e -> System.out.println("Helo Helo"));
        return new StoryFrame("/Example/1.png", "Your are at home\nWhat would you like to do now?", pair1, pair2);
    }

    public static StoryFrame atJob() {
        Pair pair1 = new Pair("Go Home", e -> updateFrame(atHome()));
        return new StoryFrame("/Example/3.jpg", "Chores done", pair1);
    }

    public static StoryFrame market() {
        Pair pair1 = new Pair("Fight", e -> updateFrame(win()));
        return new StoryFrame("/Example/2.jpg", "Enemy has appeared", pair1);
    }

    public static StoryFrame win() {
        Pair pair1 = new Pair("Go Home", e -> updateFrame(atHome()));
        return new StoryFrame("/Example/3.jpg", "You won", pair1);
    }

    public StoryFrame startingFrame() {
        return atHome();
    }
}
