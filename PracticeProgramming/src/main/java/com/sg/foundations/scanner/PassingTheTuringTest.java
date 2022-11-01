package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String favColor;
        String favFruit;
        int favNumber;


        System.out.println("Hello there!");

        System.out.println("What is your name??");
            yourName = inputReader.nextLine();

        System.out.println("Hi, " +  yourName + "!" + " My name is Patrick.");

        System.out.println("What is your favorite color?");
            favColor = inputReader.nextLine();
        System.out.println("Huh" + ", " + favColor + "? " + "Mine is Electric Lime.");

        System.out.println("I really like limes. They're my favorite fruit" + ", too.");
        System.out.println("What's YOUR favorite fruit, " + yourName + " ?" );
            favFruit = inputReader.nextLine();

        System.out.println("Really? " + favFruit + "?" + " That's Wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");

        favNumber = inputReader.nextInt();

        System.out.println( favNumber + " is a cool number." + " Mine's -7.");
        int number = -7;
        int total = favNumber * number ;
        System.out.println("Did you know " + favNumber + " * " + number + " is "  + total + "? That's a cool number too!");

    }

}
