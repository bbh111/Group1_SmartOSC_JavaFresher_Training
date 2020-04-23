package com.fitech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose;
        double inches;
        double miles;
        double gallons;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu---");
            System.out.println("0. Exit");
            System.out.println("1. Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("3. Bai 3");
            System.out.println("4. Bai 4");
            System.out.println("5. Bai 5");
            System.out.println("6. Bai 6");
            System.out.println("your choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("enter amount of inches: ");
                    inches = sc.nextDouble();
                    System.out.println(inches + " inches = " + Conversions.inchesToCentimeters(inches) + " centimeters");
                    System.out.println("enter amount of gallons: : ");
                    gallons = sc.nextDouble();
                    System.out.println(gallons + " gallons = " + Conversions.gallonsToLiters(gallons) + " liters");
                    System.out.println("enter amount of miles: ");
                    miles = sc.nextDouble();
                    System.out.println(miles + " miles = " + Conversions.milesToKilometers(miles) + " kilometers");
                    break;
                case 2:
                    System.out.println("enter amount of inches: ");
                    inches = sc.nextDouble();
                    System.out.println(inches + " inches = " + InchesToCentimeters.inchesToCentimeters(inches) + " centimeters");
                    System.out.println("enter amount of gallons: : ");
                    gallons = sc.nextDouble();
                    System.out.println(gallons + " gallons = " + GallonsToLiters.gallonsToLiters(gallons) + " liters");
                    System.out.println("enter amount of miles: ");
                    miles = sc.nextDouble();
                    System.out.println(miles + " miles = " + MilesToKilometers.milesToKilometers(miles) + " kilometers");
                    break;
                case 3:
                    int c;
                    CheckingAccount checkingAccount = new CheckingAccount();
                    do {
                        System.out.println("Enter 0 to exit");
                        System.out.println("Enter 1 to deposit");
                        System.out.println("Enter 2 to withdrawal");
                        System.out.println("Enter 3 to watch your balance");
                        System.out.println("Please enter a number: ");
                        c = sc.nextInt();
                        switch (c) {
                            case 0: break;
                            case 1:
                                System.out.println("enter amount: ");
                                checkingAccount.deposit(sc.nextDouble());
                                System.out.println(checkingAccount.toString());
                                break;
                            case 2:
                                System.out.println("enter amount: ");
                                checkingAccount.withdrawal(sc.nextDouble());
                                System.out.println(checkingAccount.toString());
                                break;
                            case 3:
                                System.out.println(checkingAccount.toString());
                                break;
                        }
                    } while (c != 0);
                    break;
                    case 4:
                    SavingAccount savingAccount = new SavingAccount();
                    do {
                        System.out.println("Enter 0 to exit");
                        System.out.println("Enter 1 to deposit");
                        System.out.println("Enter 2 to withdrawal");
                        System.out.println("Enter 3 to earn monthly interest");
                        System.out.println("Enter 4 to watch your balance");
                        System.out.println("Please enter a number: ");
                        c = sc.nextInt();
                        switch (c) {
                            case 0: break;
                            case 1:
                                System.out.println("enter amount: ");
                                savingAccount.deposit(sc.nextDouble());
                                System.out.println(savingAccount.toString());
                                break;
                            case 2:
                                System.out.println("enter amount: ");
                                savingAccount.withdrawal(sc.nextDouble());
                                System.out.println(savingAccount.toString());
                                break;
                            case 3:
                                savingAccount.earnMonthlyInterest();
                                System.out.println(savingAccount.toString());
                            case 4:
                                System.out.println(savingAccount.toString());
                                break;

                        }
                    } while (c != 0);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter name of point: ");
                    String name = sc.nextLine();
                    System.out.println("Enter x: ");
                    double x = sc.nextDouble();
                    System.out.println("Enter y: ");
                    double y = sc.nextDouble();
                    LabeledPoint labeledPoint = new LabeledPoint(name, x, y);
                    System.out.println(labeledPoint.toString());
                    break;
                case 6:
                    Rectangle rectangle = new Rectangle();
                    rectangle.centerPoint();
                    Circle circle = new Circle();
                    circle.centerPoint();
                    break;
                default:break;
            }
        } while (choose != 0);
    }
}
