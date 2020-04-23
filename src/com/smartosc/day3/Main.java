package com.smartosc.day3;

import com.smartosc.day3.entity.ex1_2.*;
import com.smartosc.day3.entity.ex3_4.*;
import com.smartosc.day3.entity.ex5.LabeledPoint;
import com.smartosc.day3.entity.ex6.Circle;
import com.smartosc.day3.entity.ex6.Rectangle;
import com.smartosc.day3.entity.ex6.Shape;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UnitConversion conversion;
        Shape shape;
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        while (true) {
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
                    System.out.println("Nhập số tiền bạn muốn rút: ");
                    if (checkingAccount.withdraw(scanner.nextDouble())){
                        System.out.println("Rút tiền thành công!");
                        checkingAccount.charges();
                        System.out.println(String.format("Số dư hiện tại còn: %s", checkingAccount.getBalance()));
                    } else {
                        System.out.println("Rút tiền thất bại!");
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tiền bạn muốn gửi: ");
                    if (checkingAccount.deposit(scanner.nextDouble())){
                        System.out.println("Gửi tiền thành công!");
                        checkingAccount.charges();
                        System.out.println(String.format("Số dư hiện tại còn: %s", checkingAccount.getBalance()));
                    } else {
                        System.out.println("Gửi tiền thất bại!");
                    }
                    break;
                case 6:
                    savingsAccount.execute();
                    break;
                case 7:
                    System.out.println("Nhập tên label:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tọa độ x: ");
                    float x = scanner.nextFloat();
                    System.out.println("Nhập tọa độ y: ");
                    float y = scanner.nextFloat();
                    LabeledPoint labeledPoint = new LabeledPoint(x, y, name);
                    System.out.println(labeledPoint.toString());
                    break;
                case 8:
                    shape = new Rectangle();
                    shape.centerPoint();
                    break;
                case 9:
                    shape = new Circle();
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
        }
    }

    public static void enterValue(UnitConversion unitConversion) {
        System.out.println("Vui long nhap gia tri: ");
        System.out.println(unitConversion.conversion(scanner.nextDouble()));
    }
}
