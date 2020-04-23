package com.smartosc.day2;
import com.smartosc.day2.controller.ArrayController;
import com.smartosc.day2.controller.BankController;
import com.smartosc.day2.controller.TimeController;
import com.smartosc.day2.entity.Person;
import java.util.Scanner;

public class MainDay2 {
    public static void main(String[] args) {
        ArrayController arrayController = ArrayController.getController();
        BankController bankController = BankController.getController();
        TimeController timeController = TimeController.getController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("========== BÀI TẬP ==========");
            System.out.println("1. Arrays (1->7)");
            System.out.println("2. Bank (8)");
            System.out.println("3. Time (9->10)");
            System.out.println("3. Person (11)");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chọn: ");
            switch (scanner.nextInt()) {
                case 1:
                    arrayController.generateViewConsole();
                    break;
                case 2:
                    bankController.generateViewConsole();
                    break;
                case 3:
                    timeController.generateViewConsole();
                case 4:
                    System.out.println("Vui lòng nhập tên đầy đủ: ");
                    new Person(scanner.nextLine());
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại!");
            }
        }
    }
}
