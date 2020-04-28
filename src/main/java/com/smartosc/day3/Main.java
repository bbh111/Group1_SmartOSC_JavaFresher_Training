package com.smartosc.day3;

import com.smartosc.day3.entity.ex1_2.*;
import com.smartosc.day3.entity.ex3_4.*;
import com.smartosc.day3.entity.ex5.LabeledPoint;
import com.smartosc.day3.entity.ex5.Point;
import com.smartosc.day3.entity.ex6.Circle;
import com.smartosc.day3.entity.ex6.Rectangle;
import com.smartosc.day3.entity.ex6.Shape;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UnitConversion conversion;
        Shape shape;
        BankAccount bankAccount;
        do {
            System.out.println("===== BÀI TẬP DAY 3 =====");
            System.out.println("1. Inch sang cm. (Ex1,2)");
            System.out.println("2. Mile sang km. (Ex1,2)");
            System.out.println("3. Gallon sang lit. (Ex1,2)");
            System.out.println("4. Rút tiền. (Ex3)");
            System.out.println("5. Gửi tiền tiền. (Ex3)");
            System.out.println("6. Tiền lãi hàng tháng (Ex4).");
            System.out.println("7. Khởi tạo LabeledPoint (Ex5).");
            System.out.println("8. Trung tâm Hình chữ nhật (Ex6).");
            System.out.println("9. Trung tâm hình tròn (Ex6).");
            System.out.println("0. Thoát.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    conversion = new InchesToCentimeters();
                    enterValue(conversion);
                    break;
                case 2:
                    conversion = new MilesToKilometers();
                    enterValue(conversion);
                    break;
                case 3:
                    conversion = new GallonsToLiters();
                    enterValue(conversion);
                    break;
                case 4:
                    bankAccount = new CheckingAccount();
                    System.out.println("Nhập số tiền bạn muốn rút: ");
                    if (bankAccount.withdraw(scanner.nextDouble())) {
                        System.out.println("Rút tiền thành công!");
                        System.out.println(String.format("Số dư hiện tại còn: %s", bankAccount.getBalance()));
                    } else {
                        System.out.println("Rút tiền thất bại!");
                    }
                    break;
                case 5:
                    bankAccount = new CheckingAccount();
                    System.out.println("Nhập số tiền bạn muốn gửi: ");
                    if (bankAccount.deposit(scanner.nextDouble())) {
                        System.out.println("Gửi tiền thành công!");
                        System.out.println(String.format("Số dư hiện tại còn: %s", bankAccount.getBalance()));
                    } else {
                        System.out.println("Gửi tiền thất bại!");
                    }
                    break;
                case 6:
                    bankAccount = new SavingsAccount();
                    System.out.println(String.format("Số dư trong tài khoản hiện tại: %s", bankAccount.getBalance()));
                    double result = bankAccount.earnMonthlyInterest();
                    if (result > 0) {
                        System.out.println("Thêm tiền lãi thành công!");
                        System.out.println(String.format("Số tiền lãi tháng là: %s$", result));
                        System.out.println(String.format("Số dư hiện tại là: %s$", bankAccount.getBalance()));
                    }
                    break;
                case 7:
                    System.out.println("Nhập tên label:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tọa độ x: ");
                    float x = scanner.nextFloat();
                    System.out.println("Nhập tọa độ y: ");
                    float y = scanner.nextFloat();
                    Point labeledPoint = new LabeledPoint(x, y, name);
                    System.out.println(labeledPoint.toString());
                    break;
                case 8:
                    shape = new Rectangle(10, 3);
                    shape.centerPoint();
                    break;
                case 9:
                    shape = new Circle(1, 2);
                    shape.centerPoint();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("lua chon sai vui long chon lai.");
                    break;
            }
            if (choice == 0) {
                System.exit(0);
            }
        } while (true);
    }

    public static void enterValue(UnitConversion unitConversion) {
        System.out.println("Vui long nhap gia tri: ");
        System.out.println(unitConversion.conversion(scanner.nextDouble()));
    }
}
