package com.smartosc.day2;

import com.smartosc.day2.controller.ArrayController;

import java.util.Arrays;

public class MainDay2 {
    public static void main(String[] args) {
        ArrayController controller = ArrayController.getController();

        // Ex 1
        // System.out.println(Arrays.toString(controller.getArraysInt(7)));

        // EX 2
        // System.out.println(Arrays.toString(controller.swapsEle(new int[] {1, 2, 3, 4, 5, 6})));

        // EX 3
        System.out.println(Arrays.toString(controller.swapsIndexNegative(new int[] {-5, -4, 0, -3, -2, -1, 1, 3, 4, 5, 2, -3})));
    }

}
