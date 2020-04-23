package com.company.day3.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        double currentMoney = bankAccount.getTotalMoneyInAccount();

        System.out.println("Current total money in your account: " + currentMoney + "$");
        System.out.println("Our's services: \n\t1.Deposit.\n\t2.Withdrawal.\n");


        System.out.println("Your select: ");
        int select=sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Enter deposit(Deposit must be smaller than total money in your account): ");
                bankAccount.setDeposit(sc.nextDouble());
                currentMoney = bankAccount.deposit(currentMoney, bankAccount.getDeposit());
                System.out.println("Total money: " + currentMoney+"$");
                System.out.println("Charges: 1$");
                System.out.println("Total money after depositing: " + bankAccount.Charges(currentMoney)+"$");
                break;
            case 2:
                System.out.println("Enter withdrawal(Withdrawal must be smaller than total money in your account): ");
                bankAccount.setWithdrawal(sc.nextDouble());
                currentMoney = bankAccount.withdrawal(currentMoney, bankAccount.getWithdrawal());
                System.out.println("Total money: " + currentMoney+"$");
                System.out.println("Charges: 1$");
                System.out.println("Total money after withdrawing: " + bankAccount.Charges(currentMoney)+"$");
                break;
            default:
                System.err.println("Error System.");
                break;
        }
    }
}
