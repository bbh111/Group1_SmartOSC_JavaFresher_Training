import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        testNewSingleThread();
        testFixedThread();
    }
    
    public static void testNewSingleThread() throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "-" + finalI));
            Thread.sleep(200);
        }
        executorService.shutdown();
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Chạy mất :" + elapsedTime / 1_000_000_000 + " giây.");
    }

    public static void testFixedThread() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.execute(() -> System.out.println(Thread.currentThread().getName() + "-" + finalI));
            Thread.sleep(200);
        }
        executorService.shutdown();
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Chạy mất :" + elapsedTime / 1_000_000_000 + " giây.");
    }
}
