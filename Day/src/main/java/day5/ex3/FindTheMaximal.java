package day5.ex3;

import java.util.ArrayList;
import java.util.List;

public class FindTheMaximal
{
    public static  <T extends Number> void findMaximal(List<T> list , int begin, int end) throws IndexOutOfBoundsException
    {

//        if(end > list.size() || begin < 0 )
//        {
//            throw new  ExceptionBound("Nhập sai");
//        }
        int max = list.get(begin).intValue();
        for (int i = begin; i < end; i++) // 1,2,3,9,5
        {
            if (list.get(i).intValue() > list.get(i + 1).intValue())
            {
                max = list.get(i).intValue();
            } else
            {
                max = list.get(i + 1).intValue();
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args)  {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        try
        {
            findMaximal(list , 1 ,8);
        } catch (IndexOutOfBoundsException exceptionBound)
        {
//            System.out.println(exceptionBound.getMessage());
            System.out.println("Nhập sai");
        }
    }
}
