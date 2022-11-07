package com.sg.foundations.flowcontrol.arrays;
import java.util.Arrays;

public class SimpleCombination {
    public static void main(String[] args) {

        System.out.println("All together now! :");

            int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
            int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};

            int[] wholeNumbers = new int[24];

            int a1 = firstHalf.length;
            int b1 = secondHalf.length;
            int c1 = a1 + b1;

                    int[] c = new int[c1];
        System.arraycopy(firstHalf, 0, c, 0, a1);
        System.arraycopy(secondHalf, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));
    }
        }

