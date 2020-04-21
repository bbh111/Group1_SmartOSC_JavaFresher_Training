package com.smartosc;

import com.smartosc.utl.ErrorUtil;
import com.smartosc.utl.NumberUtil;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static long result = 1;
    public static void main(String[] args) {
        generateViewConsole();
    }

    public static void generateViewConsole() {
        boolean isNumberResult;
        NumberUtil numberUtil = new NumberUtil();
        ErrorUtil errorUtil = new ErrorUtil();
        while (true) {
            System.out.println("1. Get the first character of String");
            System.out.println("2. Get the last character of String");
            System.out.println("3. Use BigDecimal to compute huge number");
            System.out.println("4. Countdown number to 0");
            System.out.println("5. Convert character in String into their ASCII");
            System.out.println("6. Recursive Function: Function 5");
            System.out.println("7. Get n characters of the First Left side of String");
            System.out.println("8. Get n characters of the First Right side of String");
            System.out.println("9. Drop n characters of the First Left side of String");
            System.out.println("10. Drop n characters of the First Right side of String");
            System.out.println("11. Exit");
            System.out.println("-------------------------*--------------------------\n");
            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();
            isNumberResult = numberUtil.checkIsNumber(choice);

            while (!isNumberResult) {
                errorUtil.alertErrorNumberFormat("(1 -> 11)");
                choice = scanner.nextLine();
                isNumberResult = numberUtil.checkIsNumber(choice);
            }

            String s;
            int number;
            switch (Integer.parseInt(choice)) {

                case 1:
                    System.out.println("Please enter String:");
                    System.out.println(getFirstCharacter(scanner.nextLine()));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Please enter String:");
                    System.out.println(getLastCharacter(scanner.nextLine()));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Please enter number base:");
                    BigInteger base = scanner.nextBigInteger();
                    System.out.println("Please enter number exponent:");
                    int exponent = scanner.nextInt();
                    System.out.println(getBigInt(base, exponent));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Please enter number:");
                    countDown(scanner.nextInt());
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Please enter String:");
                    System.out.println(convertStringToUniCode(scanner.nextLine()));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Please enter String:");
                    System.out.println(convertToASCII(scanner.nextLine()));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Please enter string:");
                    s = scanner.nextLine();
                    System.out.println("Please enter number character:");
                    number = scanner.nextInt();
                    System.out.println(takeLeft(number, s));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Please enter string:");
                    s = scanner.nextLine();
                    System.out.println("Please enter number character:");
                    number = scanner.nextInt();
                    System.out.println(takeRight(number, s));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 9:
                    System.out.println("Please enter string:");
                    s = scanner.nextLine();
                    System.out.println("Please enter number character:");
                    number = scanner.nextInt();
                    System.out.println(dropLeft(number, s));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 10:
                    System.out.println("Please enter string:");
                    s = scanner.nextLine();
                    System.out.println("Please enter number character:");
                    number = scanner.nextInt();
                    System.out.println(dropRight(number, s));
                    System.out.println("Press Enter to back");
                    scanner.nextLine();
                    break;
                case 11:
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;
                default:
                    errorUtil.alertErrorChoice("(1 -> 11)");
                    break;
            }
        }
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
            System.out.println(number);
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
        for (byte aByte : bytes) {
            result *= aByte;
        }
        return result;
    }

    // Bài 5
    public static long convertToASCII(String string) {
        if (string.isEmpty()) {
            return result;
        }
        result *= (int) string.charAt(0);
        return convertToASCII(string.substring(1));
    }

    // Bài 6
    public static String takeLeft(int n, String string) {
        return string.substring(0, n);
    }

    // Bài 7
    public static String takeRight(int n, String string) {
        return string.substring(string.length() - (n + 1), string.length() - 1);
    }

    // Bài 8
    public static String dropLeft(int n, String s) {
        return s.substring(n, s.length() - 1);
    }

    // Bài 9
    public static String dropRight(int n, String s) {
        return s.substring(0, s.length() - (n + 1));
    }
}
