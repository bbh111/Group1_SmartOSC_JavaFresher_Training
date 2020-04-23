package com.smartosc.day3.entity.ex3_4;

public class CheckingAccount extends BankAccount {
    public CheckingAccount() {
        super();
    }

    public void charges() {
        if (this.countTransition == 0) {
            this.balance--;
        } else {
            this.countTransition--;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

