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

////         Ex 1
//         System.out.println(Arrays.toString(arrayController.getRandomInts(7)));
//
////         EX 2
//         System.out.println(Arrays.toString(arrayController.swapsEle(new int[] {1, 2, 3, 4, 5, 6})));
//
////         EX 3
//         System.out.println(Arrays.toString(arrayController.swapsIndexNegative(new int[] {-5, -4, 0, -3, -2, -1, 1, 3, 4, 5, 2, -3})));
//
////         EX 4
//         System.out.println(arrayController.calcAverage(new double[] {10, 10}));
//
////         EX 5
//         System.out.println(Arrays.toString(arrayController.sortDESC(new Integer[]{10, 11, 12, 9, 6, 20})));
//
//         Ex 6
//         System.out.println(Arrays.toString(arrayController.removeDuplicates(new Integer[]{2, 2, 6, 8, 8, 10, 12, 12})));
//
////         Ex 7
//         System.out.println(Arrays.toString(arrayController.getAllTimeZoneByPrefixName("America/")));

////        Ex 8
//        bankController.generateViewConsole();

////         Ex 9
//        Time time = new Time(10, 0);
//        Time timeOther = new Time(11, 0);
//        System.out.println(time.checkBefore(timeOther));

////        Ex 10
//        Time time = new Time(10, 0);
//        System.out.println(time.getTotalMin());

////        Ex 11
//
    }

}
