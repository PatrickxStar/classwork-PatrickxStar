package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {

        int favNumber;
        Scanner inputReader = new Scanner(System.in);

        int number = 1;

        System.out.println("Which times table shall i recite?");
        favNumber = inputReader.nextInt();
        for (int i = 1; i < 16; i++)
        {
            int total = favNumber * i;
            System.out.println(i + "*" + favNumber + " is: " + total);
        }
    }
}

