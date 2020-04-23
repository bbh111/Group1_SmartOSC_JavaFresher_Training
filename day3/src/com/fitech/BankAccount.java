package com.fitech;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
