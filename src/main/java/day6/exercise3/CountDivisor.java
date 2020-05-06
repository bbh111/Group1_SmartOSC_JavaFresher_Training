package day6.exercise3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CountDivisor {
    private int start;
    private int end;
    private int MAX = 100000;

    private static Logger logger = LoggerFactory.getLogger(CountDivisor.class);
    public Result findOutLagestDevisor(int numberOfThread) throws Exception {
        final Result finalRs = new Result();
        if (MAX % numberOfThread != 0) {
            numberOfThread += 1;
        }
        List<Future<Result>> list = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(numberOfThread);
        Future<Result> future;
        start = 1;
        end = MAX / numberOfThread;
        for (int i = 0; i < numberOfThread; i++) {
            FindThread findThread = new FindThread(start,end);
            future = (Future<Result>) service.submit(findThread);
            list.add(future);
            start = end + 1;
            if((i == numberOfThread -1)&&MAX%numberOfThread!=0){
                end = MAX;
            }else{
                end += MAX / numberOfThread;
            }
        }
        service.shutdown();
        list.forEach((futures) ->{
            try {
                if(futures.get().getMaxCount()>=finalRs.getMaxCount()){
                    finalRs.setMaxCount(futures.get().getMaxCount());
                    finalRs.setMaxDivisorsNumber(futures.get().getMaxDivisorsNumber());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        return finalRs;
    }
}
