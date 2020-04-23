package com.smartosc.day3.entity.ex3_4;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {

    public void execute() {
        System.out.println(String.format("Số dư trong tài khoản hiện tại: %s", this.balance));
        double result = this.earnMonthlyInterest();
        if (result == 0) {
            return;
        }
        this.resetCountTransition();
        System.out.println("Thêm tiền lãi thành công!");
        System.out.println(String.format("Số tiền lãi tháng là: %s$", result));
        System.out.println(String.format("Số dư hiện tại là: %s$", this.balance));
    }

    public void resetCountTransition() {
        this.countTransition = 3;
    }
}
