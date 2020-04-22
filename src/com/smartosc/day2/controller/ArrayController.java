package com.smartosc.day2.controller;

import com.smartosc.utl.NumberUtil;

import java.util.*;

public class ArrayController {
    public static ArrayController instance;

    // Ex 1
    public int[] getRandomInts(int elmNumber) {
        int[] ints = new int[elmNumber];
        for (int i = 0; i < elmNumber; i++) {
            ints[i] = NumberUtil.randomInt(elmNumber);
        }
        return ints;
    }

    // Ex 2
    public int[] swapsEle(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            if (i % 2 == 0 && (i + 1) < ints.length) {
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        return ints;
    }

    // Ex 3
    public int[] swapsIndexNegative(int[] ints) {
        int j = 0, temp;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                // nếu index == nhau thì bỏ qua.
                if (i != j) {
                    // Gán giá trị cho temp = giá trị của ints[i] vị trí thứ i nếu nó lớn 0
                    temp = ints[i];
                    // Hoản đổi vị trí của số dương vừa tìm đc = ints[j], j ban đầu = 0 => lấy giá giá trị đầu tiên vào thay cho nó.
                    ints[i] = ints[j];
                    // Gán giá trị ints[j], j ban đầu = 0 => biến temp được lấy chính là số dương được gán vào vị trí đầu.
                    ints[j] = temp;
                }
                // Sau khi đoạn trên thực hiện phải cho j + 1 vì số dương đầu tiên đã tìm được ta phải next đến vị trí index tiếp theo.
                j++;
            }
        }
        return ints;
    }

    // Ex 4
    public double calcAverage(double[] doubles) {
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        return sum / doubles.length;
    }

    // Ex 5
    public Integer[] sortDESC(Integer[] ints) {
        Arrays.sort(ints, Collections.reverseOrder());
        return ints;
    }

    // Ex 6
    public Integer[] removeDuplicates(Integer[] arr) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(arr));
        return integerHashSet.toArray(new Integer[] {});
    }

    // Ex 7
    public String[] getAllTimeZoneByPrefixName(String prefix) {
        List<String> list = new ArrayList<>();
        for (String timezone: TimeZone.getAvailableIDs()) {
            if (timezone.startsWith(prefix)) {
                list.add(timezone);
            }
        }
        return list.toArray(new String[]{});
    }

    // Ex 8



    public static ArrayController getController() {
        if (instance == null) {
            instance = new ArrayController();
        }
        return instance;
    }
}
