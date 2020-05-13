import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        testNewSingleThread();
//        testFixedThread();
        String[] lang = {"Java", "C#", "C++", "PHP", "Javascript", "Java"};
        Stream<String> stream = Arrays.stream(lang);
        Predicate<String> predicate = s -> s.equals("Java");
        Predicate<String> integerPredicate = s -> s.length() < 30;
        stream.parallel().filter(predicate.and(integerPredicate)).forEach(System.out::println);
//        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
//        Stream<String[]> temp = Arrays.stream(data);
////        temp.flatMap(Arrays::stream).peek(System.out::println).forEach(System.out::println);
//        Stream<String> stream1 = Arrays.stream(lang);
//        stream1.sorted(MyCompare::compare).distinct().forEach(System.out::println);
//        IMyCompare<String> iMyCompare = MyCompare::new;
//        iMyCompare.b("SLowV");
//        C<MyCompare> c = MyCompare::new;
//        c.get();
        String name = "SlowV";
        System.out.println(Optional.of(Optional.of(Optional.of(name))).flatMap(x -> x.flatMap(y -> y.map(String::toUpperCase))));
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
