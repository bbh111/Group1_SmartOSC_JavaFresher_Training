package com.company.day3.bai1;

import java.util.Scanner;

public class bai1 {

    public static class Conversions {
        public double inchesToCentimeters(double inches) {
            return inches * 2.54;
        }

        public double gallonsToLiters(double gallons) {
            return gallons * 3.785;
        }

        public double milesToKilometers(double miles) {
            return miles * 1.609;
        }
    }

    public static void main(String[] args) {
        Conversions conversions = new Conversions();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + conversions.inchesToCentimeters(inches) + " centimeters\n");

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons = " + conversions.gallonsToLiters(gallons) + " liters\n");

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + conversions.milesToKilometers(miles) + " kilometers");
    }
}
