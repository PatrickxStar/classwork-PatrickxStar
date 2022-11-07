package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String animal = animal();
        String colorAgain = "Brown";
        String weight = "200";
        String color = color();

        Random randomizer = new Random();
        int distance = randomizer.nextInt(10) + 10;
        int number = randomizer.nextInt(10000) + 10000;
        int time = randomizer.nextInt(2) + 4;

        // need help with creating 5 random generated number and animal names

        System.out.println("I was chased by a " + color + ", " + weight + " lb" + " miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over " + number + " " + color + " poppies for nearly " + time + " hours until it left me alone!");
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
        System.out.println("Once, when i was very small ...");

    }

    public static String color() {

        Random randomizer = new Random();
        int color = randomizer.nextInt(5);
        switch (color) {
            case 0:
                // System.out.println("Red");
                return "red";
            // break;
            case 1:
                return "blue";
            case 2:
                return "grey";
            case 3:
                return "orange";
            case 4:
                return "black";
        }
        return "pink";
    }
    public static String animal() {

        Random randomizer = new Random();
        int animal = randomizer.nextInt(5);
        switch (animal) {
            case 0:
                // System.out.println("Red");
                return "bird";
            case 1:
                return "cow";
            case 2:
                return "bull";
            case 3:
                return "dog";
            case 4:
                return "cat";
        }
        return "parrot";
    }

        public static String weight () {

            return "200";
        }
        public static String colorAgain () {

            return "Brown";
        }
        public static int distance () {

            return 20;
        }
        public static int number () {

            return 10000;
        }
        public static int time () {

            return 5;
        }
    }

