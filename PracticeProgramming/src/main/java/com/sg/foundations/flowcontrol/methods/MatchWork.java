package com.sg.foundations.flowcontrol.methods;

public class MatchWork {
    public static void main(String[] args) {

        int myNum = 1337 * 1337;
        double pi = 3.14;
        double halfOf = 21;
        String a = "The first letter of the word Llama is: L ";
        boolean b = false;

        System.out.println(" The word Cart should come before Horse alphabetically : " + b );
        System.out.println(" Half of 42 = " + halfOf );
        System.out.println(" (short) Pi = " + pi );
        System.out.println( a );
        System.out.println(" 1337 x 1337 = " + myNum);

    }

    public static double pi(){

        return 3.14;
    }

    public static int times1337(int x){
        return 1337 * 1337;
    }

    public static double halfOf(double y) {
        return 42 / 2;
    }

    public static String firstLetter(String word){
        return "The first letter of the word Llama is: L";
    }

    public static boolean comesBefore(String a, String b){
        return true;
    }
}
