package day6.exercise12;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;

public class Exercise1 {
    public static Storage list = new Storage(new ArrayList<>());
    public static int end = 10;

    public static void main(String[] args) throws InterruptedException {
        Counting counting = new Counting();
        Printer printer = new Printer();
        execute(counting, printer, 0);
        //executeSemaphore(counting,printer,0);
    }

    public static void execute(Counting counting, Printer printer, int endPoint) {
        if (endPoint == end) return;
        CompletableFuture<Counting> future = new CompletableFuture<>();
        CompletableFuture<Printer> future1 = new CompletableFuture<>();
        //Thread.sleep(1000);
        counting.run();
//        printer.run();
//        execute(counting, printer, endPoint += 1);
        if (future.complete(counting)) {
            printer.run();
            if (future1.complete(printer)) {
                execute(counting, printer, endPoint += 1);
            }
        }
    }

    public static void executeSemaphore(Counting counting, Printer printer, int endPoint) {
        if (endPoint == end) return;
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            counting.run();
            semaphore.release();
            printer.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            execute(counting, printer, endPoint += 1);
        }
    }

    static long elapseTime(){
        long start = System.nanoTime();
        long end = System.nanoTime();
        return end-start;
    }
}
