package day5.ex3;

import java.util.ArrayList;
import java.util.List;

public class FindTheMaximal
{
    public static  <T extends Number> void findMaximal(List<T> list , int begin, int end) throws ExceptionBound
    {

        if(end > list.size() || begin < 0 )
        {
            throw new  ExceptionBound("Nhập sai");
        }
        double max = list.get(begin).doubleValue();
        for (int i = begin; i < end; i++) // 1,2,3,9,5
        {
            if (list.get(i).doubleValue() > list.get(i + 1).doubleValue())
            {
                max = list.get(i).doubleValue();
            } else
            {
                max = list.get(i + 1).doubleValue();
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        try
        {
            findMaximal(list , 1 ,4);
        } catch (ExceptionBound exceptionBound)
        {
            System.out.println(exceptionBound.getMessage());
        }
    }
}
