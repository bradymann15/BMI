package com.LickingHeights;

import java.util.Scanner;

public class Main {

    //declare
    public static void main(String[] args) {
	String greeting, name;
    int inches, pounds;
    double meters, kilograms, bmi;
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
    meters = (inches/39.37);
    System.out.println("What is your weight in pounds?");
    pounds = keyboard.nextInt();
    System.out.print("Now, we will take your weight in pounds (" + pounds);
    System.out.println(") and convert it into kilograms for you.");
    kilograms = (pounds/2.205);
    System.out.println("Now, we will calculate your BMI.");
    bmi = kilograms/(meters*meters);
    System.out.println(bmi + " is your BMI.");









    }
}
