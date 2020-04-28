package main.java.day5.ex3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public <T extends Comparable<T>> T maximum(List<T> list) {
        T max = list.get(0);
        for (T ele : list) {
            if (ele.compareTo(max) > 0) {
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 22, 7, 9, 17};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Ex3 ex3 = new Ex3();
        double temp = ex3.maximum(Arrays.asList(doubleArray));
        System.out.println(temp);
    }
}
