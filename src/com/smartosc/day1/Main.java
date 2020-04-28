package com.smartosc.day1;

import com.smartosc.utl.ErrorUtil;
import com.smartosc.utl.NumberUtil;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    static Scanner scanner = new Scanner(in);
    static long result = 1;
    public static void main(String[] args) throws InterruptedException {
        generateViewConsole();
    }

    public static void generateViewConsole() throws InterruptedException {
        boolean isNumberResult;
        NumberUtil numberUtil = new NumberUtil();
        ErrorUtil errorUtil = new ErrorUtil();
        do {
            out.println("1. Get the first character of String");
            out.println("2. Get the last character of String");
            out.println("3. Use BigDecimal to compute huge number");
            out.println("4. Countdown number to 0");
            out.println("5. Convert character in String into their ASCII");
            out.println("6. Recursive Function: Function 5");
            out.println("7. Get n characters of the First Left side of String");
            out.println("8. Get n characters of the First Right side of String");
            out.println("9. Drop n characters of the First Left side of String");
            out.println("10. Drop n characters of the First Right side of String");
            out.println("11. Exit");
            out.println("-------------------------*--------------------------\n");
            out.println("Enter your choice: ");
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
                    out.println("Please enter String:");
                    out.println(getFirstCharacter(scanner.nextLine()));
                    scanner.nextLine();
                    break;
                case 2:
                    out.println("Please enter String:");
                    out.println(getLastCharacter(scanner.nextLine()));
                    scanner.nextLine();
                    break;
                case 3:
                    out.println("Please enter number base:");
                    BigInteger base = scanner.nextBigInteger();
                    out.println("Please enter number exponent:");
                    int exponent = scanner.nextInt();
                    out.println(getBigInt(base, exponent));
                    scanner.nextLine();
                    break;
                case 4:
                    out.println("Please enter number:");
                    countDown(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    out.println("Please enter String:");
                    out.println(convertStringToUniCode(scanner.nextLine()));
                    scanner.nextLine();
                    break;
                case 6:
                    out.println("Please enter String:");
                    out.println(convertToASCII(scanner.nextLine()));
                    scanner.nextLine();
                    break;
                case 7:
                    out.println("Please enter string:");
                    s = scanner.nextLine();
                    out.println("Please enter number character:");
                    number = scanner.nextInt();
                    out.println(takeLeft(number, s));
                    scanner.nextLine();
                    break;
                case 8:
                    out.println("Please enter string:");
                    s = scanner.nextLine();
                    out.println("Please enter number character:");
                    number = scanner.nextInt();
                    out.println(takeRight(number, s));
                    scanner.nextLine();
                    break;
                case 9:
                    out.println("Please enter string:");
                    s = scanner.nextLine();
                    out.println("Please enter number character:");
                    number = scanner.nextInt();
                    out.println(dropLeft(number, s));
                    scanner.nextLine();
                    break;
                case 10:
                    out.println("Please enter string:");
                    s = scanner.nextLine();
                    out.println("Please enter number character:");
                    number = scanner.nextInt();
                    out.println(dropRight(number, s));
                    scanner.nextLine();
                    break;
                case 11:
                    out.println("Good bye!");
                    exit(0);
                    break;
                default:
                    errorUtil.alertErrorChoice("(1 -> 11)");
                    break;
            }
        } while (true);
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
    public static void countDown(int number) throws InterruptedException {
        for (int i = number; i >= 0; i--) {
            out.println(number);
            Thread.sleep(1000);
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
