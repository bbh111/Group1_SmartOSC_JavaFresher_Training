package day6.exercise3;

import java.util.concurrent.Callable;

public class FindThread extends Thread implements Callable {
    int start;
    int end;

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
            if(count>maxCount){
                maxCount = count;
                maxDivisors = i;
            }
        }
        return new Result(maxDivisors,maxCount);
    }


    @Override
    public void run() {

    }
}
