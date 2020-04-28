package com.company.day3.bai3_4;

class CheckingAccount extends BankAccount{
    public CheckingAccount() {
        super();
    }
    public double charges(double balance) {
        return balance - 1;
    }
}
