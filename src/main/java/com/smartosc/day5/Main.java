package com.smartosc.day5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author trinh
 * @version 0.1
 * @since 28/04/2020 - 12:40
 */
public class Main {
    static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        cat(new File("./src/main/java/com/smartosc/day4/day4.txt"));
    }

    private static <T extends Integer> boolean checkPrime(T k) {
        int root = k;
        if (root < 2) {
            return false;
        } else {
            for (int i = 2; i <= root / 2; i++) {
                if (root % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void handlerEx1() {
        Integer[] ints = {1, 2, 3, 4, 5, 6, -1, -2, -3, -4};
        int countOdd = 0;
        int countPrime = 0;
        for (int i : ints) {
            if (checkPrime(i)) {
                countPrime++;
            } else {
                countOdd++;
            }
        }
        System.out.println(String.format("Số phần tử số lẻ là: %d phần tử %nSố phần tử số nguyên tố là: %d phần tử", countOdd, countPrime));
    }

    public static void handlerEx2() {
        String[] arrStr = {"Hello", "World"};
        System.out.println(Arrays.toString(swap(arrStr, 0, 1)));
    }

    public static <T> T[] swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return arr;
    }

    public static void handlerEx3() {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 20, 39, 12, 2, 6));
        int begin = 0;
        int end = integers.size() - 1;
        System.out.println(String.format("Số lớn nhất bắt đầu từ %d đến %d là: %d", begin, end, getMaxInRange(integers, begin, end)));
    }

    public static  <T extends Integer> T getMaxInRange(List<? extends T> arr, T begin, T end) {
        T max;
        if (arr.isEmpty())
            throw new IllegalStateException("Can't get a max element from an empty list.");
        else {
            max = arr.get(begin);
            for (T elem : arr.subList(begin, end)) {
                if (elem.compareTo(max) > 0) {
                    max = elem;
                }
            }
        }
        return max;
    }

    public static void cat(File file) {
        String line;
        try(RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            LOGGER.trace(e.getMessage());
        }
    }
}
