package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only" + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiiitle longer.....");
            timeNow++; // The amount of time it passes.
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess i should go to bed ...");
    }
}
