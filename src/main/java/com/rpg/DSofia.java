package com.rpg;

public class DSofia extends StoryGroup {
    public static StoryFrame atCrimeScene() {
        Pair pair1 = new Pair("Examine the shards of the shattered mirror closely", e -> updateFrame(atCrimeScene2("You notice the shards reflect odd angles,leandig you to discorver a hidden compartment in the wall containing a sketchbook of disturbing drawings")));
        Pair pair2 = new Pair("Analyze the torn painting", e -> updateFrame(atCrimeScene2("You find faint fingerprints on the torn edges, suggesting the killer might have been interrupted")));
        return new StoryFrame("The team is at Atul's house : cryptic message,shattered mirror, and torn painting\n", pair1, pair2);
    } 
    public static StoryFrame atCrimeScene2(String s){
        Pair pair1 = new Pair("Take the sketchbook to analyze patterns in the drawings", e-> updateFrame(atAbandonedFactory("You identify one recurring face in the face in the sketches a woman who appears to have been watching Atul")));
        Pair pair2 = new Pair("Question Atul's assistant about the last few days",e-> updateFrame(atAbandonedFactory("The assistant mentins strange letters Atul had been recieving but doesn't know from who")));
        return new StoryFrame(s+"\nA sketchbook is discovered",pair1,pair2);
    }

    public static StoryFrame atAbandonedFactory(String s){
        GUIGameScreen.changeBackground(Helper.getImageIcon("/Warehouse.jpg"));
        Pair pair1 = new Pair("Sneak in quietly and look for clues",e-> updateFrame(theEnd()));
        Pair pair2 = new Pair(" Confront the masked figure directly.",e->updateFrame(theEnd()));
        return new StoryFrame(s+"The team is at the abandoned factory",pair1,pair2);
    }
    
    public static StoryFrame theEnd(){
        GUIGameScreen.changeBackground(Helper.getImageIcon("/End.jpg"));
        Pair pair1 = new Pair("Exit", e->Main.exit(0));
        return new StoryFrame("The team captured the murderer", pair1);
    }
    @Override
    public StoryFrame startingFrame() {
        return atCrimeScene();
    }
        
}
