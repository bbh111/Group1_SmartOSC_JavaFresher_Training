package day3;

import day3.*;

public class BankAccount {
    Valid valid = new Valid();
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit() {
        double money = valid.enterDoubleNumber(0, "Enter money: ", Integer.MAX_VALUE);
        balance += money;
        System.out.println("Balance is: " + balance);
    }

    public void withdraw() {
        double money = valid.enterDoubleNumber(0, "Enter money: ", balance);
        balance -= money;
        System.out.println("Balance is: " + balance);
    }
}
