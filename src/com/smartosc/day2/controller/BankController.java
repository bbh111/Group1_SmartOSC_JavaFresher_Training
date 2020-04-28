package com.smartosc.day2.controller;
import com.smartosc.day2.entity.BankAccount;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class BankController {
    private static BankAccount bankAccount = new BankAccount();
    public static final AtomicReference<BankController> instance = new AtomicReference<>();
    public void generateViewConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("======= BANK ========");
            System.out.println("Số dư hiện tại: " + bankAccount.getBalance());
            System.out.println("1. RÚT TIỀN");
            System.out.println("2. GỬI TIỀN");
            System.out.println("3. Quay lại");
            System.out.println("Vui lòng nhập lựa chọn: ");
            int choice = scanner.nextInt();
            int amount;
            switch (choice) {
                case 1:
                    System.out.println(" ========== RÚT TIỀN ==========");
                    System.out.println("Vui lòng nhập số tiền bạn muốn rút: ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                    if (bankAccount.updateBalance(amount, BankAccount.Type.WITHDRAW)) {
                        System.out.println("Rút tiền thành công!");
                        System.out.println("Số dư hiện tại là: " + bankAccount.getBalance());
                        System.out.println("Ấn enter để tiếp tục.....");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println(" ========== GỬI TIỀN ==========");
                    System.out.println("Vui lòng nhập số tiền bạn muốn gửi: ");
                    amount = scanner.nextInt();
                    scanner.nextLine();
                    if (bankAccount.updateBalance(amount, BankAccount.Type.DEPOSIT)) {
                        System.out.println("Gửi tiền thành công!");
                        System.out.println("Số dư hiện tại là: " + bankAccount.getBalance());
                        System.out.println("Ấn enter để tiếp tục.....");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại!");
                    break;
            }
        }
    }
    public static BankController getController() {
        if (instance.get() == null) {
            instance.set(new BankController());
        }
        return instance.get();
    }
}
