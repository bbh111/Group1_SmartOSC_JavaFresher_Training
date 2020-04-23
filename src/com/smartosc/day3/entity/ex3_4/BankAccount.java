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

    public double earnMonthlyInterest(double principal, double rate, double time) {
        double emi;
        rate = rate / (12 * 100); // one month interest
        time = time * 12; // one month period
         emi = (principal * rate * (float)Math.pow(1 + rate, time))
                / (float)(Math.pow(1 + rate, time) - 1);
        this.balance += emi;
        return emi;
    }
}
