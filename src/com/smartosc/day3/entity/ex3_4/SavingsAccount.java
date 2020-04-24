package com.smartosc.day3.entity.ex3_4;
public class SavingsAccount extends BankAccount {

    public boolean execute() {
        System.out.println(String.format("Số dư trong tài khoản hiện tại: %s", this.balance));
        double result = this.earnMonthlyInterest();
        if (result == 0) {
            return false;
        }
        System.out.println("Thêm tiền lãi thành công!");
        System.out.println(String.format("Số tiền lãi tháng là: %s$", result));
        System.out.println(String.format("Số dư hiện tại là: %s$", this.balance));
        return true;
    }

    public void resetCountTransition() {
        this.countTransition = 3;
    }
}
