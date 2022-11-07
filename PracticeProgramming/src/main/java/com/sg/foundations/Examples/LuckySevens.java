package com.sg.foundations.Examples;
import java.util.Scanner;
import java.util.Random;
public class LuckySevens {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random generator = new Random();

        int die1, die2,
                dollars,
                dollarsPerLoop,
                count,
                totalCount,
                averageCount;
        count = 0;
        totalCount = 0;
        averageCount = 0;

        System.out.print("How many dollars do you have? ");
        dollarsPerLoop = reader.nextInt();

        for (int i=1; i <= 100; i++) {


            dollars = dollarsPerLoop;

            count = 0;

            while (dollars > 0){
                count++;

                die1 = generator.nextInt (6) + 1; // 1-6
                die2 = generator.nextInt (6) + 1; // 1-6

                if (die1 + die2 == 7) {
                    dollars += 4;
                }
                else {
                    dollars -= 1;
                }

            }

            totalCount = totalCount + count;
            //System.out.println("totalCount: " + totalCount);

        }

        averageCount = totalCount / 100;

        System.out.println("You are broke after an average of " + averageCount + " rolls.\n");
    }
}
