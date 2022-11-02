package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class PickyEater {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many time has it been fried? (#)");
        int timesFried = Integer.parseInt(userInput.nextLine());

        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();

        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();

        if (cheeseCovered.equals("y)"))
            System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");

        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());

        if (butterPats > 6) {
            System.out.println("As long as the green is hiddn by chedder, it'll happen!");
        }

        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = userInput.nextLine();

        // Still not familiar with AND/OR but i will keep reviewing!

        if (timesFried < 2) {
            System.out.println("Oh, it's life a deep-fried Snickers. That'll be a hit!");
        }
        if (timesFried > 4) {
            System.out.println("Oh, it's life a deep-fried Snickers. That'll be a hit!");
        }
        if (chocolatedCovered.equals("y"))
            System.out.println("Oh, it's life a deep-fried Snickers. That'll be a hit!");

        System.out.println("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");

            System.out.print("Is it broccoli? (y/n) ");
            String isBroccoli = userInput.nextLine();

            // Not sure why it is not printing out this statement
            if (isBroccoli.equals("y"))
                System.out.println("Oh, green stuff like that might as well go in the in.");

            }
        }
    }