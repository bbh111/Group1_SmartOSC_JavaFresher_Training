package com.fitech;

public class CheckingAccount extends BankAccount{

    public void charge() {
        balance -= 1;
    }
}