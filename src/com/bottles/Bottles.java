package com.bottles;

public class Bottles {

    public String verse(int count) {
        int nextCount = count - 1;

        String firstLine = captialize(remainingBottles(count)) + " " + bottles(count) + " of beer on the wall, " + remainingBottles(count) + " " + bottles(count) + " of beer.";
        String secondLine = (count == 0) ? "Go to the store and buy some more, 99 bottles of beer on the wall." :
                            "Take " + (count == 1 ? "it" : "one") + " down and pass it around, " + remainingBottles(nextCount) + " " + bottles(nextCount) + " of beer on the wall.";

        return firstLine + secondLine;
    }

    private String captialize(String phrase) {
        return phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
    }

    private String remainingBottles(int count) {
        return count == 0 ? "no more" : "" + count;
    }

    private String bottles(int amount) {
        return "bottle" + (amount == 1 ? "" : "s");
    }

    public String verses(int from, int to) {

        String verses = "";

        for(int i=from ;  i>=to; i--){
            verses = verses + verse(i);
        }

        return verses;
    }

    public String song() {
        return verses(99,0);
    }
}
