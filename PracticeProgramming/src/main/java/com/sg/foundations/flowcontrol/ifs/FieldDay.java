package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {

    public static void main(String[] args) {

        String a = "Baggins";
        String b = "Dresden";
        String c = "Howl";
        String d = "Potter";
        String e = "Vimes";

        System.out.println("What's your last name?");
        Scanner inputReader = new Scanner(System.in);
        String lastName = inputReader.nextLine();


        if(lastName.compareTo(a) <=0) {
            System.out.println("Red Dragons!");
        }else if(lastName.compareTo(a) >=0 && lastName.compareTo(b) <=0) {
            System.out.println("Dark Wizards!");
        }else if(lastName.compareTo(b) >=0 && lastName.compareTo(c) <=0) {
            System.out.println("Moving Castles!");
        }else if(lastName.compareTo(c) >=0 && lastName.compareTo(d) <=0) {
            System.out.println("Golden Snitches!!");
        }else if(lastName.compareTo(d) >=0 && lastName.compareTo(e) <=0) {
            System.out.println("night Guards!!");
        }else{
            System.out.println("Black Holes!");
            }
        }
    }

