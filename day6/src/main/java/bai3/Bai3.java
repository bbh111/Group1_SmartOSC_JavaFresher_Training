package bai3;

import java.util.concurrent.CompletableFuture;

public class Bai3{

    public boolean isDivisor(int n, int number) {
        if (number == 0) return false;
        return n%number==0;
    }

    public int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isDivisor(n, i))
                count++;
        }
        return count;
    }

    public int[] countMaxDivisors(int n) {
        int count = 0;
        int maxAmountDivisors = 0;
        int divisors = 0;
        for (int i = 1; i < n; i++) {
            divisors = countDivisors(i);
            if (maxAmountDivisors < divisors) {
                maxAmountDivisors = divisors;
                count = i;
            }
        }
        return new int[] {count, maxAmountDivisors};
    }

    public static void main(String[] args) {
        int n = 100000;
        long time1 = System.currentTimeMillis();
        CountDivisorsWithThreads countDivisorsWithThreads = new CountDivisorsWithThreads();
        int[] a = countDivisorsWithThreads.countDivisors(n);
        System.out.println("a0 = " + a[0]);
        System.out.println("a1 = " + a[1]);

        System.out.println(System.currentTimeMillis() - time1);
//        long time2 = System.currentTimeMillis();
//        Bai3 bai3 = new Bai3();
//        int[] ar = bai3.countMaxDivisors(n);
//        System.out.println(ar[0]);
//        System.out.println(ar[1]);
//        System.out.println(System.currentTimeMillis()-time2);
    }
}
