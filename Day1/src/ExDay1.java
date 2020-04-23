import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExDay1 {
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        ExDay1 ex = new ExDay1();
//
//        ex.recursionConvertUnicode("phu",1);


    }

    public void getCharacter() {
        String name = "Hello";
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        System.out.println("Ký tự đầu tiên: " + first);
        System.out.println("Ký tự cuối cùng: " + last);
    }

    public void calculate() {
        BigInteger bi = new BigInteger("2");
        BigInteger result = bi.pow(1024);
        System.out.println(result);
    }

    public void countDown() {
        for (int i = 10; i >= 0; i--)
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public void convertUnicode()
    {
        String s1 = "Hello";
        char[] charArray = s1.toCharArray();
        Long result = 1L;
        for (int i = 0; i < s1.length(); i++)
        {
            long a = (long) charArray[i];
            result = result * a;
        }
        System.out.println(result);
    }

    public long recursionConvertUnicode(String string, long result)
    {
        if (string.isEmpty())
        {
            return 1L;
        }
        result = result * (long) string.charAt(0);
        return recursionConvertUnicode(string.substring(1),result);
    }

    public int recursion(int n)
    {
        if (n > 0) {
            return n * recursion(n - 1);
        } else {
            return 1;
        }
    }

    public void takeLeft(int n, String input)
    {
        String takeLeft = input.substring(0,n);
        System.out.println(takeLeft);
    }

    public void takeRight(int n, String input)
    {
        int x = input.length();
        String takeRight = input.substring(x - n,x);
        System.out.println(takeRight);
    }

    public void dropLeft(int n, String input)
    {
        int x = input.length();
        String dropLeft = input.substring(n,x);
        System.out.println(dropLeft);
    }

    public void dropRight(int n, String input)
    {
        String dropRight = input.substring(0, input.length() - n);
        System.out.println(dropRight);
    }
}
