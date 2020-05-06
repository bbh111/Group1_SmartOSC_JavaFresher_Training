package day6.exercise12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Printer extends Thread {
    private static Logger logger = LoggerFactory.getLogger(Printer.class);
    Storage list = Exercise1.list;
    @Override
    public void run() {
        ArrayList lst = (ArrayList)list.getList();
        if(lst!=null){
            System.out.println(lst.get(lst.size()-1));
            logger.info("thread printer {}", Thread.currentThread().getName());
            logger.info("Current number is: "+lst.get(lst.size()-1).toString());
        }
    }
}
