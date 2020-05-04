package day6.exercise12;

import java.util.ArrayList;

public class Printer implements Runnable {
    Storage list = Exercise1.list;
    @Override
    public void run() {

        ArrayList lst = (ArrayList)list.getList();
        if(lst!=null){
            System.out.println(lst.get(lst.size()-1));
        }
    }
}
