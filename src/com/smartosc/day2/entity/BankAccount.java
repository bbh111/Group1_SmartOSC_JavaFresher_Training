package com.smartosc.day2.entity;

import java.util.UUID;

public class BankAccount {
    private String id;
    private String username;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String username, double balance) {
        this.id = UUID.randomUUID().toString();
    }

    // Withdraw
    public boolean updateBalance(double amount, Type type) {
        if (0 > amount) {
            System.out.println("Vui lòng nhập số lớn hơn 0.");
            return false;
        }
        if (type.number == Type.WITHDRAW.getInt()) {
            if (amount > this.balance) {
                System.out.println("Số tiền bạn muốn rút lớn hơn số dư vui lòng thử lại!");
                return false;
            }
            this.balance -= amount;
            return true;
        } else if (type.number == Type.DEPOSIT.getInt()) {
            this.balance += amount;
            return true;
        }

        System.out.println("Phương thức không tồn tại vui lòng chọn RÚT TIỀN hoặc GỬI TIỀN ");
        return false;

    }

    enum Type {
        WITHDRAW(1), DEPOSIT(0);
        private int number;

        Type(int number) {
            this.number = number;
        }

        public int getInt() {
            return number;
        }

        public static Type getStatusByValue(int value) {
            for (Type status : Type.values()) {
                if (status.number == value) return status;
            }
            throw new IllegalArgumentException("Type not found!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
