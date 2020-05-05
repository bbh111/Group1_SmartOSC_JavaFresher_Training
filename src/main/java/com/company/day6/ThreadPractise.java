package com.company.day6;

import java.util.concurrent.*;

public class ThreadPractise extends Thread {
    static class Calculator {
        int plus(int a, int b) {
            System.out.println(a + " + " + b + " = " + (a + b));
            return a + b;
        }
    }

    static class Name implements Runnable {
        String name;

        Name(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            try {
                System.out.println(Thread.currentThread().getName() + " Starting: " + name);
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Finish: " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        /*Calculator calculator = new Calculator();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        CompletableF
        uture<Integer> future1 = CompletableFuture.supplyAsync(() -> calculator.plus(5, 46), executorService);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> calculator.plus(6, 454), executorService);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> calculator.plus(2, 1356), executorService);

        future1.get(5, TimeUnit.SECONDS);

        System.out.println("Done.");
        executorService.shutdown();*/

        ExecutorService executorService = Executors.newScheduledThreadPool(30);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Name("request: " + i));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            //System.out.println("isTerminated!");
        }
    }
}
