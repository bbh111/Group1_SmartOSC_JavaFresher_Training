import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContDivisors {
    static volatile int max = 100000;
    static volatile int maxDivisorCount = 0;
    static volatile int intWithMaxDivisorCount;

    public static void ex3() {
        int numberOfThreads = 30;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        System.out.println("\nĐếm số chia sử dụng " +
                numberOfThreads + " luồng...");
        long startTime = System.currentTimeMillis();
        int integersPerThread = max / numberOfThreads;
        int start = 1;
        int end = start + integersPerThread - 1;
        for (int i = 0; i < numberOfThreads; i++) {
            if (i == numberOfThreads - 1) end = max;
            executorService.execute(new CountDivisorThread(start, end));
            start = end + 1;
            end = start + integersPerThread - 1;
        }
        executorService.shutdown();
        // Wait until all threads are finish
        while (!executorService.isTerminated()) {
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Finished all threads");
        System.out.println("\nSố lượng ước số lớn nhất " +
                "cho các số từ 1 đến " + max + " là: " + maxDivisorCount);
        System.out.println("Một số nguyên có nhiều ước là: " +
                intWithMaxDivisorCount);
        System.out.println("Tổng thời gian:  " +
                (elapsedTime / 1000.0) + " giây.\n");
    }

    static class CountDivisorThread implements Runnable {

        int max, min;

        public CountDivisorThread(int min, int max) {
            this.max = max;
            this.min = min;
            System.out.format("count divisor min(%d) - max(%d) %n", this.min, this.max);
        }

        @Override
        public void run() {
            int maxDivisors = 0;
            int whichInt = 0;
            for (int i = min; i < max; i++) {
                int divisor = countDivisors(i);
                if (divisor >= maxDivisors) {
                    maxDivisors = divisor;
                    whichInt = i;
                }
            }
            report(maxDivisors, whichInt);
        }

        private synchronized static void report(int maxCountFromThread, int intWithMaxFromThread) {
            if (maxCountFromThread >= maxDivisorCount) {
                maxDivisorCount = maxCountFromThread;
                intWithMaxDivisorCount = intWithMaxFromThread;
            }
        }
    }

    public static int countDivisors(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ex3();
    }
}
