package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class StayPositive {

    public static void main(String[] args) {


        int yourNumber;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What number should i count down from?");
        yourNumber = inputReader.nextInt();

        int toBlast = yourNumber;
        int toTakeoff = 0;

        System.out.println("Counting Down. . .");

        while (toBlast >= 0) {
            System.out.println(toBlast--);
        }
        System.out.println("Blast Off!");
    }
}


