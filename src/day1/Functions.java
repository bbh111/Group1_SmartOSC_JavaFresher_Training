package day1;

import java.math.BigDecimal;

public class Functions {
    public static Long rs = 1L;

    public Functions() {

    }

    public char getFirstChar(String s) {
        return s.charAt(0);
    }

    public char getLastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    public BigDecimal getResult(int a, int b) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(a);
        return bigDecimal1.pow(b);
    }

    public void countDown(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public Long convertString(String s) {
        long result = 1L;
        for (int i = 0; i < s.length(); i++) {
            result *= (int) s.charAt(i);
        }
        return result;
    }

    // Đệ quy convert String =>> ASCII


    public Long convertToASCII(String s) {
        if (s.isEmpty()) {
            return rs;
        }
        rs *= (int) s.charAt(0);
        return convertToASCII(s.substring(1));
    }

    // String function take n elements of String s
    public String getNLeftFirstElement(int n, String s) {
        if (n > s.length()) {
            return "Vui lòng nhập n < " + s.length();
        }
        return s.substring(0, n);
    }

    // String function take n Right elements of String s
    public String getNRightFirstElement(int n, String s) {
        if (n > s.length()) {
            return "Vui lòng nhập n < " + s.length();
        }
        return s.substring(s.length() - n);
    }

    // String function drop n Left elements of String s
    public String dropNLeftFirstElement(int n, String s) {
        if (n > s.length()) {
            return "Vui lòng nhập n < " + s.length();
        }
        return s.substring(s.length() - n);
    }

    // String function drop n Left elements of String s
    public String dropNRightFirstElement(int n, String s) {
        if (n > s.length()) {
            return "Vui lòng nhập n < " + s.length();
        }
        return s.substring(0, n);
    }
}
