package com.rpg;

public class DSofia extends StoryGroup {
    public static StoryFrame atCrimeScene() {
        Pair pair1 = new Pair("Search for immediate threats or weapons left behind", e -> updateFrame(atCrimeScene2("You find a knife with dried paint on the handle—possibly the murder weapon.")));
        Pair pair2 = new Pair("Focus on the cryptic message (What you see is not always real).", e -> updateFrame(atCrimeScene2("You realize the message is a taunt meant to challenge the detectives and delay them.")));
        return new StoryFrame("The team is at Atul's house : cryptic message,shattered miror, and torn painting\n", pair1, pair2);
    } 
    public static StoryFrame atCrimeScene2(String s){
        Pair pair1 = new Pair("Visit Victor Kane’s last known address to investigate", e-> updateFrame(atAbandonedFactory("You find the apartment abandoned but discover emails on a discarded laptop hinting at a collaboration with someone")));
        Pair pair2 = new Pair("Question Atul's assistant about the last few days",e-> updateFrame(atAbandonedFactory(" The assistant appears nervous and admits to hiding letters Eleanor had received, fearing they’d escalate.")));
        return new StoryFrame(s+"\nA sketchbook is discovered",pair1,pair2);
    }

    public static StoryFrame atAbandonedFactory(String s){
        GUIGameScreen.changeBackground(Helper.getImageIcon("/Warehouse.jpg"));
        Pair pair1 = new Pair("Burst in and overpower the masked figure",e-> updateFrame(theEnd()));
        Pair pair2 = new Pair("Distract the figure while looking for a way to rescue Victor",e->updateFrame(theEnd()));
        return new StoryFrame(s+"The team is at the abandoned factory",pair1,pair2);
    }
    
    public static StoryFrame theEnd(){
        GUIGameScreen.changeBackground(Helper.getImageIcon("/End.jpg"));
        Pair pair1 = new Pair("Exit", e->Main.exit(0));
        return new StoryFrame("The end", pair1);
    }
    @Override
    public StoryFrame startingFrame() {
        return atCrimeScene();
    }
        
}
