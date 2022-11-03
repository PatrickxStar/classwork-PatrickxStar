package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        boolean cleanRoom = false;
        Random randomizer = new Random();

        int x = randomizer.nextInt(100);

        int counter = 1;

        do {
            if (x >= 100)
            {
                cleanRoom = true;
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }
            else if (counter == 7) {
                cleanRoom = true;
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
            } else {
                System.out.println("Clean your room!!(" + counter + "X)");
                counter++;
                x = x + 10;
            }
        }
        while (cleanRoom == false);
    }
}



