package com.fitech;

public class CheckingAccount extends BankAccount{

    public void deposit(double amount) {
        balance += amount - 1;
    }

    public void withdrawal(double amount) {
        balance -= amount + 1;
    }
}
