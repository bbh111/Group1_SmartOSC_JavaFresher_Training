package com.fitech;

public class SavingAccount extends BankAccount{
    private int transactionCount = 3;

    public void deposit(double amount) {
        if (transactionCount != 0) {
            super.deposit(amount);
            this.transactionCount --;
        } else {
            balance -= amount -1;
        }
    }

    public void withdrawal(double amount) {
        if (transactionCount != 0) {
            super.withdrawal(amount);
            this.transactionCount --;
        } else {
            balance -= amount + 1;
        }
    }

    public void updateTransactionCount() {
        transactionCount = 3;
    }

    public void earnMonthlyInterest() {
        double rate = 0.1;
        balance += balance*rate;
        updateTransactionCount();
    }
}