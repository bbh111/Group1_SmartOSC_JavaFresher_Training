package com.smartosc.day3.entity.ex3_4;

public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
        super();
    }

    @Override
    public boolean withdraw(double amount) {
        boolean isDone = super.withdraw(amount);
        if (isDone) {
            this.charges(1);
        }
        return isDone;
    }
}

