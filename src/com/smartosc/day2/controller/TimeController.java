package com.smartosc.day2.controller;

import com.smartosc.day2.entity.Time;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class TimeController {
    private static final AtomicReference<TimeController> instance = new AtomicReference<>();
    public void generateViewConsole() {
        Scanner scanner = new Scanner(System.in);
        Time time;
        while (true) {
            System.out.println("======= TIME ========");
            System.out.println("1. EX-9");
            System.out.println("2. EX-10");
            System.out.println("3. Quay lại");
            System.out.println("Vui lòng nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    time = new Time(10, 0);
                    Time timeOther = new Time(11, 0);
                    System.out.println(time.checkBefore(timeOther));
                    break;
                case 2:
                    time = new Time(10, 0);
                    System.out.println(String.format("Tổng số phút của %d là: %d", time.getHours(), time.getTotalMin()));
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại!");
                    break;
            }
        }
    }
    public static TimeController getController() {
        if (instance.get() == null) {
            instance.set(new TimeController());
        }
        return instance.get();
    }
}
