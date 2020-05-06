package day6.exercise3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

public class FindThread  implements Callable<Result> {
    int start;
    int end;
    private static Logger logger = LoggerFactory.getLogger(CountDivisor.class);
    public FindThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Result call() throws Exception {
        Integer maxDivisors = 1;
        int maxCount = 1;
        for(int i= start;i<=end;i++){
            int count = 0;
            for(int j = i;j>0;j--){
                if(i%j == 0){
                    count++;
                }
            }
            if(count>=maxCount){
                maxCount = count;
                maxDivisors = i;
            }
        }
        //logger.info(maxDivisors + ":"+maxCount);
        return new Result(maxDivisors,maxCount);
    }
}
