package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {

        String answer1 = "";
        String answer2 = "";
        String answer3 = "";

        Scanner scan = new Scanner(System.in);

        int numberCorrect = 0;
        int questions = 3;

        // Question number 1 ----------------------------
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println(" FIRST QUESTION!");

        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source code");
        System.out.println("2) Assembly Language");
        System.out.println("3) C#");
        System.out.println("4) Machine Code");

        answer1 = scan.nextLine();

        if (answer1.equals("4")) {
            System.out.println("Good job, that's correct!");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("That's wrong, try again.");
        }
        // Question Number 2 ---------------------
        System.out.println("SECOND QUESTION!");

        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper");
        System.out.println("2) Alan Turing");
        System.out.println("3) Charles Babbage");
        System.out.println("4) Larry Page");

        answer1 = scan.nextLine();

        if (answer1.equals("2")) {
            System.out.println("Good job, that's correct!");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("That's wrong, try again.");
        }
        // Question Number 3----------
        System.out.println("LAST QUESTION!");

        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity");
        System.out.println("2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise");
        System.out.println("4) The Millennium Falcon");

        answer1 = scan.nextLine();

        if (answer1.equals("3")) {
            System.out.println("Good job, that's correct!");
            numberCorrect = numberCorrect + 1;
        } else {
            System.out.println("That's wrong, try again.");
        }

        double grade = numberCorrect / 3.0 * 100.0;

        System.out.println("Your Final Grade is:");
        System.out.println(grade);
    }
}