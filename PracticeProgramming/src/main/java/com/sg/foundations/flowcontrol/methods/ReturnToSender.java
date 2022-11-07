package com.sg.foundations.flowcontrol.methods;

public class ReturnToSender {
    public static void main(String[] args) {

        char c;
        String a = "Spanish Inquisition";
        double hi = 3.14;
        boolean b = true;
        int myNum = 42;

        System.out.println("The methods have returned! Their results...\n");
        System.out.println("Mysterious: " + "X");
        System.out.println("Secret: " + myNum);
        System.out.println("Surprising: " + hi);
        System.out.println("Classified: " + b );
        System.out.println("Unexpected: " + a);
    }

    public static int secret (){
        return 42;
    }

    public static double surprise (){
        return 3.14;

    }

    public static char mystery(){

        return 'X';
    }

    public static boolean classified (){
        return true;

    }

    public static String unexpected (){

        return "Spanish Inquisition";
    }
}
