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
        // double grossPay;	Declare a variable
        double grossPay;
        // double grossPay = 0;	Declare and initialize to zero
        double overtimePay = 0;

        System.out.println("Your name is " + name + ".");
        System.out.println("You have worked " + hoursWorked + " hours this week.");
        System.out.println("Your pay rate is $" + payRate + " an hour.");
//        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * payRate * 1.5;
            grossPay = (40 * payRate) + overtimePay;

            System.out.printf("Overtime Pay: $%.2f%n", overtimePay);
        } else {
            //grossPay = hoursWorked * payRate;	Assign a value to an existing variable
            grossPay = hoursWorked * payRate;
        }
        // System.out.println(grossPay);	Display the variable's value
        System.out.printf("Gross Pay: $%.2f%n", grossPay);


        read.close();
    }
}
