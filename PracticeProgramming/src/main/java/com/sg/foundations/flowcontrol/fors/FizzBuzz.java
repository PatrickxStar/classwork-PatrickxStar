package com.sg.foundations.flowcontrol.fors;

import java.util.Random;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
            System.out.println("How many of fizzing and buzzing do you need in your life?");

            for(int i = 0; i <= 15; i++){
                String test = "";
                test += (i % 3) == 0 ? "fizz" : "";
                test += (i % 5) == 0 ? "buzz" : "";
                System.out.println(!test.isEmpty() ? test : i);
            }
        System.out.println("TRADITION!!!!!");
            }
        }


