package day6.exercise12;

import java.util.ArrayList;

public class Counting implements Runnable {
    private int count = 0;
    Storage list = Exercise1.list;
    @Override
    public void run() {

        ArrayList lst = (ArrayList)list.getList();
        lst.add(count+=1);
        if(lst.size()>=2){
            lst.remove(lst.size()-1);
        }
        list.setList(lst);
      System.out.println("Xoa "+ lst.get(lst.size()-1));
    }
}
