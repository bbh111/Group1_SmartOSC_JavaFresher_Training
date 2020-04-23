package com.company.day3.bai3_4;

class CheckingAccount {
    double deposit(double totalMoneyInAccount, double deposit) {
        return totalMoneyInAccount + deposit;
    }

    public double withdrawal(double totalMoneyInAccount, double withdrawal) {
        return totalMoneyInAccount - withdrawal;
    }

    public double Charges(double money) {
        return money - 1;
    }
}
