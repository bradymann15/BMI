package com.LickingHeights;

import java.util.Scanner;

public class Main {

    //declare
    public static void main(String[] args) {
	String greeting, name;
    int inches, pounds;
    double centimeters, kilograms, bmi;
    Scanner keyboard;

    //initialize + code
    greeting = "Hello there";
    keyboard = new Scanner(System.in);

    System.out.println("What is your name?");
    name = keyboard.nextLine();
    System.out.println(greeting + " " + name);
    System.out.println("What is your height in inches?");
    inches = keyboard.nextInt();
    System.out.print("Now, we will take your height in inches (" + inches);
    System.out.println(") and convert it into centimeters for you.");
    centimeters = (inches*2.54);
    System.out.println("What is your weight in pounds?");
    pounds = keyboard.nextInt();
    System.out.print("Now, we will take your weight in pounds (" + pounds);
    System.out.println(") and convert it into kilograms for you.");
    kilograms = (pounds/35)
    System.out.println("Now, we will calculate your BMI.");
    bmi = kilograms/(centimeters*centimeters);









    }
}
