package com.LickingHeights;

import java.util.Scanner;

public class Main {

    //declare
    public static void main(String[] args) {
	String greeting, name;
    int inches, ounces, centimeters, kilograms, bmi;
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
    System.out.println(") and convert it to centimeters for you.");
    System.out.println(inches*2.54);
    System.out.println("Type the number you get down below.");
    centimeters = keyboard.nextInt();
    System.out.println("That number will be your height in centimeters.");









    }
}
