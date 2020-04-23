package com.company.day3.bai3;

class BankAccount extends CheckingAccount{
    private double totalMoneyInAccount = 3000;
    private double deposit;
    private double withdrawal;

    double getTotalMoneyInAccount() {
        return totalMoneyInAccount;
    }

    double getDeposit() {
        return deposit;
    }

    void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    double getWithdrawal() {
        return withdrawal;
    }

    void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }


}
