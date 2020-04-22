package com.smartosc.day2;

import com.smartosc.day2.controller.ArrayController;

import java.util.Arrays;

public class MainDay2 {
    public static void main(String[] args) {
        ArrayController controller = ArrayController.getController();

        // Ex 1
        // System.out.println(Arrays.toString(controller.getRandomInts(7)));

        // EX 2
        // System.out.println(Arrays.toString(controller.swapsEle(new int[] {1, 2, 3, 4, 5, 6})));

        // EX 3
        // System.out.println(Arrays.toString(controller.swapsIndexNegative(new int[] {-5, -4, 0, -3, -2, -1, 1, 3, 4, 5, 2, -3})));

        // EX 4
        // System.out.println(controller.calcAverage(new double[] {10, 10}));

        // EX 5
        // System.out.println(Arrays.toString(controller.sortDESC(new Integer[]{10, 11, 12, 9, 6, 20})));

        // Ex 6
        // System.out.println(Arrays.toString(controller.removeDuplicates(new Integer[]{2, 2, 6, 8, 8, 10, 12, 12})));

        // Ex 7
        // System.out.println(Arrays.toString(controller.getAllTimeZoneByPrefixName("America/")));
    }

}
