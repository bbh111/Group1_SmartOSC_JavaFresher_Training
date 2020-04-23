package com.company.day3.bai3;

public class BankAccount extends CheckingAccount{
    private double totalMoneyInAccount = 3000;
    private int charges;
    private double deposit;
    private double withdrawal;

    public double getTotalMoneyInAccount() {
        return totalMoneyInAccount;
    }

    public void setTotalMoneyInAccount(double totalMoneyInAccount) {
        this.totalMoneyInAccount = totalMoneyInAccount;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }


}
