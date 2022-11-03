package com.sg.foundations.flowcontrol.random;

import java.util.Random;

import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

// Limiter on Random number generator -100 to 100
        Random randomizer = new Random();
        int randomNumber = (randomizer.nextInt(200) - 100);

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        int yourNumber = inputReader.nextInt();
// Random number generator
        System.out.println("Random number is: " + randomNumber);

        if (yourNumber == randomNumber) {
            System.out.println("Wow, nice guess! that was it!");
        } else if (yourNumber < randomNumber) {
            System.out.println("Ha, nice try - too low!");
        } else {
            System.out.println("Too bad, way too high.");
        }
    }
}


