package com.company.day5.bai2;

public class Bai2 {
    private static <T> void swap(T[] array, int i, int j) {
        T temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] collection = {1, 2, 3, 5, -7, 5, 17, 4, 8, 9, 11, 15, 13};
        swap(collection,3,6);
    }
}
