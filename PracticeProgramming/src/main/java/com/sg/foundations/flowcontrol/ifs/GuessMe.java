package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int x = 7;

        System.out.println("Pick a number, below 20.");
        int yourNumber = inputReader.nextInt();

        if (yourNumber == x){
            System.out.println("Wow, nice guess! that was it!");
        }

        else if ( yourNumber < x){
            System.out.println("Ha, nice try - too low! I chose 7");
        }

        else{
            System.out.println("Too bad, way too high. I chose 7.");
        }
    }
}
