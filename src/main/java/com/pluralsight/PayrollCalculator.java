package com.pluralsight;
import java.util.Scanner;
import java.util.*;
public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = read.nextLine();
        System.out.println("How many hours have you worked?");
        double hoursWorked = read.nextDouble();
        System.out.println("What is your pay rate?");
        double payRate = read.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println("Your name is " + name + ".");
        System.out.println("You have worked " + hoursWorked + " hours this week.");
        System.out.println("Your pay rate is $" + payRate + " an hour.");
        System.out.printf("Gross Pay: $%.2f%n", grossPay);


        read.close();
    }
}
