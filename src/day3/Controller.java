package day3;

import java.util.Scanner;

public class Controller {
    Valid valid = new Valid();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("*******************");
        System.out.println("1- Example 1");
        System.out.println("2- Example 2");
        System.out.println("3- Example 3");
        System.out.println("4- Example 4");
        System.out.println("5- Example 5");
        System.out.println("6- Example 6");
        System.out.println("7- Exit");
        System.out.println("*******************");
    }

    //Bài tập 1
    public void convertUnit() {
        Conversion conversions = new Conversion();
        menuConversion();
        System.out.print("Enter your choose: ");
        int option = valid.checkTime("Enter your choose: ", Integer.MIN_VALUE, Integer.MAX_VALUE, "Wrongg");
        switch (option) {
            case 1:
                conversions.inchesToCentimeters();
                break;
            case 2:
                conversions.gallonsToLiters();
                break;
            case 3:
                conversions.milesToKilometers();
                break;
        }
    }

    public void menuConversion() {
        System.out.println("1- Inches to Centimeters");
        System.out.println("2- Gallons to Liters");
        System.out.println("3- Miles to Kilometers");

    }

    //Bài tập 2
    public void convertUnitConversion() {
        UnitConvesion conversions = new Conversion();
        menuConversion();
        int option = valid.checkTime("Enter your choose: ", Integer.MIN_VALUE, Integer.MAX_VALUE, "Wrongg");
        switch (option) {
            case 1:
                conversions.inchesToCentimeters();
                break;
            case 2:
                conversions.gallonsToLiters();
                break;
            case 3:
                conversions.milesToKilometers();
                break;
        }
    }

    //Bài tập 3
    public void checkingAccount() {
        menuBank();
        BankAccount account = new CheckingAccount(10000);
        int option = valid.checkTime("Enter your choose: ", Integer.MIN_VALUE, Integer.MAX_VALUE, "Wrongg");
        switch (option) {
            case 1:
                account.deposit();
                break;
            case 2:
                account.withdraw();
                break;
        }
    }

    public void menuBank() {
        System.out.println("Bank Menu");
        System.out.println("1- Deposit: ");
        System.out.println("2- WithDraw: ");
    }

    //Bài tập 4
    public void savingAccount() {
        SavingAccount account = new SavingAccount(10000);
        int option = 0;
        do {
            menuBank();
            System.out.println("3- earnMonthlyInterest: ");
            System.out.println("4- Exit: ");
            option = Integer.valueOf(scanner.nextLine());
            switch (option) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    System.out.println("MonthlyInterest: " + account.earnMonthlyInterest());
                    ;
                    break;
            }
        } while (option >= 1 && option <= 3);
    }

    //Bài tập 5
    public void labelPoint() {
        Point point = new LabelPoint("Nguyễn Khánh Tài", 123, 456);
    }

    //Bài tập 6
    public void shapeClass() {
        System.out.println("1- Create Rectagle is subClass Shape: Done");
        Rectagle rectagle = new Rectagle();
        rectagle.centerPoint();
        System.out.println("2- Create Circle is subClass Shape: Done");
        Circle circle = new Circle();
        circle.centerPoint();
    }
}
