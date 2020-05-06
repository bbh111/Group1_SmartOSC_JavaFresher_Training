package com.smartosc.ex3;

public class CountDivisors {
    private static final int MAX = 100000;
    /**
     * Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị của biến tới các
     * thread khác nhau nếu biến này đang được sử dụng trong nhiều thread.
     */
    private static volatile int maxDivisorCount = 0;

    /**
     * Số nguyên có nhiều ước chung nhất. Cường nhé!
     */
    private static volatile int intWithMaxDivisorCount;

    public static class CountDivisorsThread extends Thread {
        int min, max;

        public CountDivisorsThread(int min, int max) {
            this.min = min;
            this.max = max;
        }

        private static synchronized void report(int maxCountFromThread, int intWithMaxFromThread) {
            if (maxCountFromThread > maxDivisorCount) {
                maxDivisorCount = maxCountFromThread;
                intWithMaxDivisorCount = intWithMaxFromThread;
            }
        }

        @Override
        public void run() {
            int maxDivisors = 0;
            int whichInt = 0;
            for (int i = min; i < max; i++) {
                int divisors = countDivisors(i);
                if (divisors > maxDivisors) {
                    maxDivisors = divisors;
                    whichInt = i;
                }
            }
            report(maxDivisors, whichInt);
        }
    }

    public void countDivisorsWithThreads(int numberOfThreads) {
        System.out.println("\nĐếm số chia sử dụng " +
                numberOfThreads + " luồng...");
        long startTime = System.currentTimeMillis();
        CountDivisorsThread[] worker = new CountDivisorsThread[numberOfThreads];
        int integersPerThread = MAX / numberOfThreads;
        int start = 1;
        int end = start + integersPerThread - 1;
        for (int i = 0; i < numberOfThreads; i++) {
            if (i == numberOfThreads - 1) {
                end = MAX;
            }
            worker[i] = new CountDivisorsThread(start, end);
            start = end + 1;
            end = start + integersPerThread - 1;
        }
        maxDivisorCount = 0;
        for (int i = 0; i < numberOfThreads; i++) {
            worker[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            while (worker[i].isAlive()) {
                try {
                    worker[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("\nSố lượng ước số lớn nhất " +
                "cho các số từ 1 đến " + MAX + " là: " + maxDivisorCount);
        System.out.println("Một số nguyên có nhiều ước chung là: " +
                intWithMaxDivisorCount);
        System.out.println("Tổng thời gian:  " +
                (elapsedTime / 1000.0) + " giây.\n");
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }
}


