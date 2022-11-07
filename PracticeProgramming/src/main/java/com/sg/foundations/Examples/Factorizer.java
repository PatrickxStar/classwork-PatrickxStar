package com.sg.foundations.Examples;
import java.util.Scanner;
public class Factorizer {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int number;
        boolean prime = false;

        //need help with Printing out the total number of factors for the number
        //Also print out if the number is perfect or prime.

        System.out.println("What number would you like to factor? ");
        number = inputReader.nextInt();

        System.out.println("The factors of " + number + " are:");

        int factors;
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}