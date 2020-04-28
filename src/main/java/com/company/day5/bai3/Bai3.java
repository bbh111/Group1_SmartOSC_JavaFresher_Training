package com.company.day5.bai3;

public class Bai3 {
    private static <T extends Integer> void max(T[] array, int begin, int end) {
        T max = array[begin];
        for (int i = begin; i < end; i++) {
            if ((int) max < (int) array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Integer[] collection = {1, 2, 3, 5, -7, 5, 17, 4, 8, 9, 11, 15, 13};
        max(collection,3,8);
    }
}
