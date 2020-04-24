package com.smartosc.day3.entity.ex3_4;
public class SavingsAccount extends BankAccount {

    @Override
    public double earnMonthlyInterest() {
        if (super.earnMonthlyInterest() > 0) {
            this.charges(10);
            this.countTransition = 3;
        }
        return 0;
    }
}
