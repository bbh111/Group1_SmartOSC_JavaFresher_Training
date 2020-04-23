package com.company.day3.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.setBalance(3000);
        Scanner sc = new Scanner(System.in);
        double currentMoney = account.getBalance();
        int transaction = account.getFree();

        System.out.println("Current total money in your account: " + currentMoney + "$");
        System.out.println("Our's services: \n\t1.Deposit.\n\t2.Withdrawal.");

        boolean cont = true;
        while (cont) {
            System.out.print("Your select: ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter deposit(Deposit must be smaller than total money in your account): ");
                    account.setDeposit(sc.nextDouble());
                    currentMoney = account.deposit(currentMoney, account.getDeposit());
                    System.out.println("Total money: " + currentMoney + "$");
                    transaction--;
                    account.setBalance(currentMoney);
                    if (transaction < 1) {
                        System.out.println("Charges: 1$");
                        account.earnMonthlyInterest();
                        System.out.println("Total money after depositing: " + account.getBalance() + "$");
                    } else {
                        System.out.println("Free charges.");
                        System.out.println("Total money after depositing: " + currentMoney + "$");
                    }
                    break;
                case 2:
                    System.out.println("Enter withdrawal(Withdrawal must be smaller than total money in your account): ");
                    account.setWithdrawal(sc.nextDouble());
                    currentMoney = account.withdrawal(currentMoney, account.getWithdrawal());
                    System.out.println("Total money: " + currentMoney + "$");
                    transaction--;
                    account.setBalance(currentMoney);
                    if (transaction < 1) {
                        System.out.println("Charges: 1$");
                        account.earnMonthlyInterest();
                        System.out.println("Total money after withdrawing: " + account.getBalance() + "$");
                    } else {
                        System.out.println("Free charges.");
                        System.out.println("Total money after withdrawing: " + currentMoney + "$");
                    }
                    break;
                default:
                    System.err.println("Error System.");
                    break;
            }
            System.out.print("Continue using our services?  1/yes  2/no");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cont = true;
                    break;
                case 2:
                    cont = false;
                    break;
                default:
                    break;
            }
        }
    }
}
