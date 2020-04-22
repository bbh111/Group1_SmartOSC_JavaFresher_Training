package com.smartosc.day2.entity;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 100000;
    }

    // Withdraw
    public boolean updateBalance(double amount, Type type) {
        if (0 > amount) {
            System.out.println("Vui lòng nhập số lớn hơn 0.");
            return false;
        }
        if (type.getInt()== Type.WITHDRAW.getInt()) {
            if (amount > this.balance) {
                System.out.println("Số tiền bạn muốn rút lớn hơn số dư vui lòng thử lại!");
                return false;
            }
            this.withdraw(amount);
            return true;
        } else if (type.getInt() == Type.DEPOSIT.getInt()) {
            this.deposit(amount);
            return true;
        }

        System.out.println("Phương thức không tồn tại vui lòng chọn RÚT TIỀN hoặc GỬI TIỀN ");
        return false;

    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public enum Type {
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

}
