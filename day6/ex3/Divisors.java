package day6.ex3;

import java.util.concurrent.*;

public class Divisors implements Callable<String>
{
    private int start;
    private int end;

    public Divisors()
    {
    }

    public Divisors(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public String findNumberWithMostDivisor()
    {

        int maxDivisors = 0;
        String result = "";
        System.out.println(start);

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (maxDivisors < count) {
                maxDivisors = count;
                result = i + " có nhiều ước nhất: " + maxDivisors + " ước";
            } else if (maxDivisors == count) {
                result = i + " và " + result;
            }
        }
        System.out.println(end);
        return result;
    }

    public String call()
    {
        return findNumberWithMostDivisor();
    }
}
