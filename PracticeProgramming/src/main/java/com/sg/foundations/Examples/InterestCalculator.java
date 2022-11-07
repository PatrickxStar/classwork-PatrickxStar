package com.sg.foundations.Examples;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        Scanner in = new Scanner(System.in);

        float principal, interest_rate, year;


        System.out.println("How much do you want to invest? ");

        principal = in.nextFloat();

        System.out.println("What is the annual interest rate % growth? ");

        interest_rate = in.nextFloat();

        System.out.println("How many years are you investing? ");

        year = in.nextFloat();

        System.out.println("Calculating...");

        System.out.println("Year Number\tPrincipal At beginning\tInterest Rate\tPrincipal At end");


        for(int i=1;i<=year;i++) {


            float amount = (float) (principal * Math.pow((1 + interest_rate / 400), 4 * 1));

            System.out.println(i + "\t\t$" + principal + "\t\t\t" + interest_rate + "\t\t$" + amount);


            principal = amount;

        }
        in.close();
    }
}
