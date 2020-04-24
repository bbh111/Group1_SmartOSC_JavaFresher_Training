package com.smartosc.day3.entity.ex3_4;

public abstract class BankAccount {
    protected double balance;
    protected int countTransition;
    protected double rateForMonthly;

    public BankAccount() {
        this.balance = 100;
        this.countTransition = 3;
        rateForMonthly = 0.1;
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
        double interestMonth = this.balance * this.rateForMonthly;
        this.balance += interestMonth;
        return interestMonth;
    }

    protected void charges(double amount) {
        if (this.countTransition == 0) {
            this.balance -= amount;
        } else {
            this.countTransition--;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
