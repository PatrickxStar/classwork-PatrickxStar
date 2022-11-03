package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);{
            int buzz = 1;
            int fizz = 2;
            int count = 15;

            System.out.println("How many of fizzing and buzzing do you need in your life?");
            buzz = inputReader.nextInt();

            while (count >= 0) {
                if (buzz == 3) {
                    System.out.println("buzz");
                } else if (fizz == 5){
                } else {
                    System.out.println("fizz");
                }
                System.out.println(count--);
            }
            System.out.println("TRADITION!!");
        }
    }
}


