package com.fitech;

public class SavingAccount extends BankAccount{
    private int transactionCount = 3;

    public void deposit(double amount) {
        if (transactionCount != 0) {
            balance += amount;
            this.transactionCount --;
        } else {
            balance += amount - 1;
        }
    }

    public void withdrawal(double amount) {
        if (transactionCount != 0) {
            balance -= amount;
            this.transactionCount --;
        } else {
            balance -= amount + 1;
        }
    }

    public void earnMonthlyInterest() {
        double rate = 0.1;
        balance += balance*rate;
        transactionCount = 3;
    }
}