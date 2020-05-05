package day6.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main
{
    public static void main(String[] args)
    {
        long time1 = System.currentTimeMillis();

        int start = 1;
        int end = 20000;
        String result = "";

        List<Future<String>> list = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable callable;
        Future future;

        for (int i = 1; i <= 5; i++)
        {
            callable = new Divisors(start, end);
            future = executor.submit(callable);
            list.add(future);
            start = end + 1;
            end += 20000;
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        for (Future<String> f : list)
        {
            try
            {
                result = f.get();
            }
            catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(result);

        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

    }
}
