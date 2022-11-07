package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        Random randomizer = new Random();
        int x = randomizer.nextInt(100);

        System.out.println("Fount it! It's in spot # " + x );
    }
}
