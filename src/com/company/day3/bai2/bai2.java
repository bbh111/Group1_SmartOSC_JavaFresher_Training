package com.company.day3.bai2;

import java.util.Scanner;

public class bai2 extends UnitConversion{
    public static void main(String[] args) {
        UnitConversion unitConversion = new UnitConversion();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + unitConversion.inchesToCentimeters(inches) + " centimeters\n");

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + unitConversion.gallonsToLiters(gallons) + " liters\n");

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + unitConversion.milesToKilometers(miles) + " kilometers");
    }
}
