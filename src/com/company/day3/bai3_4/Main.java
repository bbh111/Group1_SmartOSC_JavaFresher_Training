package com.company.day3.bai3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount account = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        double currentMoney = checkingAccount.getBalance();
        int transaction = account.getCountTransition();

        System.out.println("Current total money in your account: " + currentMoney + "$");
        System.out.println("Our's services: \n\t1.Deposit.\n\t2.Withdrawal.");

        boolean cont = true;
        while (cont) {
            System.out.print("Your select: ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Enter deposit(Deposit must be smaller than total money in your account): ");
                    account.setDeposit(sc.nextDouble());
                    currentMoney = account.deposit(account.getDeposit());
                    System.out.println("Total money: " + currentMoney + "$");
                    account.setBalance(currentMoney);
                    transaction--;
                    System.out.println("CountTransition: " + transaction);
                    if (transaction < 1) {
                        System.out.println("Charges: 1$");
                        account.setBalance(currentMoney + account.earnMonthlyInterest());
                        double balance = checkingAccount.charges(account.getBalance());
                        System.out.println("Total money after depositing: " + balance + "$");
                    } else {
                        System.out.println("Free charges.");
                        System.out.println("Total money after depositing: " + currentMoney + "$");
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal(Withdrawal must be smaller than total money in your account): ");
                    account.setWithdrawal(sc.nextDouble());
                    currentMoney = account.withdraw(account.getWithdrawal());
                    System.out.println("Total money: " + currentMoney + "$");
                    account.setBalance(currentMoney);
                    transaction--;
                    System.out.println("CountTransition: " + transaction);
                    if (transaction < 1) {
                        System.out.println("Charges: 1$");
                        account.setBalance(currentMoney + account.earnMonthlyInterest());
                        double balance = checkingAccount.charges(account.getBalance());
                        System.out.println("Total money after withdrawing: " + balance + "$");
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
