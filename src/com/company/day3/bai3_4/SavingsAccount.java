package com.company.day3.bai3;

public class SavingsAccount extends BankAccount {
    private double balance;
    private double interest;
    private double interestRate = 0.03;
    private int free = 3;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getFree() {
        return free;
    }

    public void earnMonthlyInterest() {
        this.free = 3;
        interest = balance * (interestRate / 12) * 12;
        balance += interest;
    }
}
