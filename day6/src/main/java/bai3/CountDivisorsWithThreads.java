package bai3;

import javax.management.monitor.Monitor;
import java.util.concurrent.*;

public class CountDivisorsWithThreads {

    public int[] countDivisors(int n) {
        Callable[] callable = new CountDivisorsWithThread[10];
//        Monitor
        return new int[] {1, 2};
    }

    static class CountDivisorsWithThread implements Callable<Integer[]>{
        private final int n;
        private final int start;
        private final int end;

        public CountDivisorsWithThread(int n, int start, int end) {
            this.n = n;
            this.start = start;
            this.end = end;
        }

        public boolean isDivisor(int n, int number) {
            if (number == 0) return false;
            return n % number == 0;
        }

        public int countDivisors(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (isDivisor(number, i))
                    count++;
            }
            return count;
        }

        public int[] countAmountMaxDivisors(int start, int end) {
            return new int[] {1, 2};
        }

        @Override
        public Integer[] call() throws Exception {
            int amountOfDivisor = 0;
            int max = 0;
            int maxIndex = 0;
            for (int i = this.start; i < this.end; i++) {
                amountOfDivisor = countDivisors(i);
                if (max <  amountOfDivisor) {
                    max = amountOfDivisor;
                    maxIndex = i;
                }
            }
            return new Integer[] {max, maxIndex};
        }
    }

}
