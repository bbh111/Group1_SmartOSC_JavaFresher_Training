package com.company.day3.bai3_4;

class BankAccount {
    protected double balance;
    protected int countTransition;
    private double deposit;
    private double withdrawal;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCountTransition() {
        return countTransition;
    }

    public void setCountTransition(int countTransition) {
        this.countTransition = countTransition;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    BankAccount() {
        this.balance = 3000;
        this.countTransition = 3;
    }

    public double withdraw(double amount) {
        if (0 < amount && amount < this.balance) {
            return this.balance -= amount;
        }
        return 0;
    }

    public double deposit(double amount) {
        if (0 < amount) {
            return this.balance += amount;
        }
        return 0;
    }

    public double earnMonthlyInterest() {
        double interestRate = 0.1;
        return this.balance * (interestRate / 12) * 12;
    }
}
