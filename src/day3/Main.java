package day3;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.doMain();
    }

    public void doMain() {
        String choice = "-1";
        do {
            option();
            int choose = -1;
            do {
                try {
                    choice = scanner.nextLine();
                    choose = Integer.parseInt(choice);
                    if (choose < 1 || choose > 5) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Must be a number");
                }
            } while (true);


            switch (choose) {
                case 1:
                    System.out.println("Conversion Machine");
                    String choice1 = "-1";
                    int choose1 = -1;
                    do {
                        do {
                            try {
                                System.out.println("-----Conversion Machine------");
                                System.out.println("1.Inches to Centimeters: ");
                                System.out.println("2.Gallon to Lits");
                                System.out.println("3.Miles to Kilometers");
                                System.out.println("4.Exit");
                                choice1 = scanner.nextLine();
                                choose1 = Integer.parseInt(choice1);
                                if (choose1 < 1 || choose1 > 4) {
                                    throw new NumberFormatException();
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Must be number from 1-4");
                            }
                        } while (Integer.parseInt(choice1) != 4);
                        switch (choose1) {
                            case 1:
                                System.out.println("Enter your Inches: ");
                                double inches = scanner.nextDouble();
                                scanner.nextLine();
                                UnitConversions u1 = new InchesToCentimeters();
                                u1.setInput(inches);
                                System.out.println(inches + " inches equals " + ((InchesToCentimeters) u1).execute() + " centimeters");
                                break;
                            case 2:
                                System.out.println("Enter your Gallon: ");
                                double gallon = scanner.nextDouble();
                                scanner.nextLine();
                                UnitConversions u2 = new GallonsToLiters();
                                u2.setInput(gallon);
                                System.out.println(gallon + " gallons equals " + ((GallonsToLiters) u2).execute() + " lits");
                                break;
                            case 3:
                                System.out.println("Enter your Miles: ");
                                double miles = scanner.nextDouble();
                                scanner.nextLine();
                                UnitConversions u3 = new MilesToKilometers();
                                u3.setInput(miles);
                                System.out.println(miles + " miles equals " + ((MilesToKilometers) u3).execute() + " kilometers");
                                break;
                        }
                    } while (Integer.parseInt(choice1) != 4);
                    break;
                case 2:
                    String choice2 = "-1";
                    int choose2 = -1;
                    do {
                        do {
                            try {
                                System.out.println("-----Banking System------");
                                System.out.println("1.Deposit Money (pay fee 1$)");
                                System.out.println("2.Withdraw Money (pay fee 1$)");
                                System.out.println("3.Deposit Money (3 times free)");
                                System.out.println("4.Withdraw Money (3 times free)");
                                System.out.println("5.Check earn interes money");
                                System.out.println("6.Exit");
                                choice2 = scanner.nextLine();
                                choose2 = Integer.parseInt(choice2);
                                if (choose2 < 1 || choose2 > 6) {
                                    throw new NumberFormatException();
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Must be number from 1-5");
                            }
                        } while (Integer.parseInt(choice2) != 6);
                        switch (choose2) {
                            case 1:
                                System.out.println("Enter the money that you want to deposit: ");
                                double money1 = scanner.nextDouble();
                                scanner.nextLine();
                                BankAccount bankAccount1 = new CheckingAccount();
                                ((CheckingAccount) bankAccount1).deposit(money1);
                                System.out.println("Deposit " + money1 + "$ into your balance. You have " + bankAccount1.getBalances());
                                break;
                            case 2:
                                System.out.println("Enter the money that you want to withdraw: ");
                                double money2 = 0;
                                BankAccount bankAccount2 = new CheckingAccount();
                                try {
                                    money2 = scanner.nextDouble();
                                    scanner.nextLine();
                                    if (money2 > bankAccount2.getBalances()) {
                                        throw new Exception();
                                    }
                                    ((CheckingAccount) bankAccount2).withdraw(money2);
                                    System.out.println("Withdraw " + money2 + "$ from your balances. You have " + bankAccount2.getBalances());
                                } catch (Exception e) {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the money that you want to deposit: ");
                                double money3 = scanner.nextDouble();
                                scanner.nextLine();
                                BankAccount bankAccount3 = new SavingAccount();
                                ((SavingAccount) bankAccount3).deposit(money3);
                                System.out.println("Deposit " + money3 + "$ from your balances. You have " + bankAccount3.getBalances());
                                System.out.println("You have " + SavingAccount.getCount() + " free times ");
                                break;
                            case 4:
                                System.out.println("Enter the money that you want to withdraw: ");
                                BankAccount bankAccount4 = new SavingAccount();
                                double money4 = 0;
                                try {
                                    money4 = scanner.nextDouble();
                                    scanner.nextLine();
                                    if (money4 > bankAccount4.getBalances()) {
                                        throw new Exception();
                                    }
                                    ((SavingAccount) bankAccount4).withdraw(money4);
                                    System.out.println("Withdraw " + money4 + "$ from your balances. You have " + bankAccount4.getBalances());
                                    System.out.println("You have " + SavingAccount.getCount() + " free times ");
                                } catch (Exception e) {
                                    System.out.println("Not enough money");
                                }
                                break;
                            case 5:
                                System.out.println("Check the interest money earn Monthly");
                                BankAccount bankAccount5 = new SavingAccount();
                                System.out.println("This money you earn " + ((SavingAccount) bankAccount5).earnMonthlyInteres() + "$");
                                System.out.println("You have 3 free deposit or withdraw times");
                                break;
                        }
                    } while (Integer.parseInt(choice2) != 6);
                    break;
                case 3:
                    System.out.println("Enter x = ");
                    double x = checkInput();
                    //scanner.nextLine();
                    System.out.println("Enter y = ");
                    double y = checkInput();
                    System.out.println("Enter label value");
                    String label = scanner.nextLine();
                    LabeledPoint lb = new LabeledPoint(x,y,label);
                    lb.Display();
                    break;
                case 4:
                    Shape shape1 = new Rectangle();
                    System.out.println("This is centerpoint of Rectangle "+((Rectangle)shape1).centerPoint());
                    Shape shape2 = new Circle();
                    System.out.println("This is centerpoint of Circle "+((Circle)shape2).centerPoint());
                    break;
            }
        } while (Integer.parseInt(choice) != 5);
    }

    public void option() {
        System.out.println("Excercise 23-4-2020");
        System.out.println("1.Conversion Machine");
        System.out.println("2.Bank System");
        System.out.println("3.Point");
        System.out.println("4.Shape");
        System.out.println("5.Exit");
        System.out.println("=========================");
    }

    public double checkInput(){
        String x = "1";
        double rs = -1;
        do{
            try{
                x = scanner.nextLine();
                rs = Double.parseDouble(x);
                break;
            }catch (NumberFormatException e){
                System.out.println("Must be a number");
            }
        }while (true);
        return rs;
    }
}

