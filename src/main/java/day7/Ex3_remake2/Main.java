package day7.Ex3_remake2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {
    static final int THREAD_SIZE = 5;
    static final int MAX_VALUE = 100000;

    public static void main(String[] args) {
        Mythread[] mythreads = new Mythread[THREAD_SIZE];
        CountDivisor divisor = new CountDivisor();
        List<Task> taskList = divisor.taskList(THREAD_SIZE,MAX_VALUE);
        long time_start = System.currentTimeMillis();
        int i =0;
        for (Thread thread : mythreads) {
            thread = new Mythread(divisor, taskList.get(i).getTask_end(),taskList.get(i).getTask_begin(), time_start);
            thread.start();
            i++;
        }

    }

}
