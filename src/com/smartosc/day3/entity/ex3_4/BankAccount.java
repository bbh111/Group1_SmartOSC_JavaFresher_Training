package com.smartosc.day3.entity.ex3_4;

public abstract class BankAccount {
    protected double balance;
    protected int countTransition;

    public BankAccount() {
        this.balance = 100;
        this.countTransition = 3;
    }

    public boolean withdraw(double amount) {
        if (0 < amount || amount < this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (0 < amount) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public double earnMonthlyInterest() {
        double rateForMonthly = 0.1;
        this.balance += this.balance * rateForMonthly;
        return rateForMonthly;
    }
}
