package com.company.day5.bai1;

public class Bai1 {
    private static <T extends Integer> int countNumber(T[] collection) {
        int count = 0;
        boolean flag = true;
        for (T t : collection) {
            if ((int) t >= 2) {
                for (int j = 2; j < (int) t / 2; j++) {
                    if ((int) t % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] collection = {1, 2, 3, 5, -7, 5, 17, 4, 8, 9, 11, 15, 13};
        System.out.println(countNumber(collection));
    }
}
