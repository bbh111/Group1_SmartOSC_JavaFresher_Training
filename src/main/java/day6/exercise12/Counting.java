package day6.exercise12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Counting extends Thread {
    private int count = 0;
    Storage list = Exercise1.list;
    private static Logger logger = LoggerFactory.getLogger(Printer.class);
    @Override
    public void run() {
        ArrayList lst = (ArrayList)list.getList();
        lst.add(count+=1);
//        if(lst.size()>=2){
//            lst.remove(lst.size()-1);
//        }
        list.setList(lst);
        logger.info("thread counter {}", Thread.currentThread().getName());
        logger.info("Set number is: "+count);
      //System.out.println("Xoa "+ lst.get(lst.size()-1));
    }
}
