package com.smartosc;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Bài 1
        String string = "Hello World!";
        // System.out.println(getLastCharacter(string));
        // System.out.println(getFirstCharacter(string));

        // Bài 2
        // System.out.println(getLongNumber(new BigInteger("2"), 21024));

        // Bài 3
        // countDown(10);

        // Bài 4
        System.out.println(convertStringToUniCode("Hello"));

        // Bài 5
        // System.out.println(getString(string));

        // Bài 6
        // System.out.println(takeLeft(2, string));

        // Bài 7
        // System.out.println(takeRight(2, string));

        // Bài 8
        // System.out.println(dropLeft(2, string));

        // Bài 9
        // System.out.println(dropRight(2, string));
    }

    public static void generateViewConsole() {
        System.out.println();
    }

    // Bài 1
    public static char getLastCharacter(String string) {
        return string.charAt(string.length() - 1);
    }

    public static char getFirstCharacter(String string) {
        return string.charAt(0);
    }

    // Bài 2
    public static BigInteger getBigInt(BigInteger base, int exponent) {
        return base.pow(exponent);
    }

    // Bài 3
    public static void countDown(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(number - (i + 1));
            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // bài 4
    public static long convertStringToUniCode(String string) {
        byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);
        long result = 1;
        for (byte aByte : bytes) {
            result *= aByte;
        }
        return result;
    }

    // Bài 5
    public static String getString(String string) {
        int n = string.length();
        if (n == 0) {
            return null;
        } else {
            System.out.print((int) string.charAt(0));
            return getString(string.substring(1, n));
        }
    }

    // Bài
    public static String takeLeft(int n, String string) {
        return string.substring(0, n);
    }

    public static String takeRight(int n, String string) {
        return string.substring(string.length() - (n + 1), string.length() - 1);
    }

    public static String dropLeft(int n, String s) {
        return s.substring(n, s.length() - 1);
    }

    public static String dropRight(int n, String s) {
        return s.substring(0, s.length() - (n + 1));
    }
}
