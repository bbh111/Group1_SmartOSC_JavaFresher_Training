package com.smartosc.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountDivisors countDivisors = new CountDivisors();
        Scanner in = new Scanner(System.in);
        int numberOfThreads = 0;
        while (numberOfThreads < 1 || numberOfThreads > 10) {
            System.out.println("Bạn muốn tạo ra bao nhiêu Luồng(Thread) (1 -> 10) ?");
            numberOfThreads = in.nextInt();
            if (numberOfThreads < 1 || numberOfThreads > 10)
                System.out.println("Vui lòng nhập số từ 1 đến 10 !");
        }
        countDivisors.countDivisorsWithThreads(numberOfThreads);
    }
}
