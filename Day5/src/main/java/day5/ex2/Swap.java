package day5.ex2;

import java.util.Arrays;

public class Swap<T extends Number>
{
    public T[] swapIndex( T[] array, int i , int j )
    {
        T t ;
        t = array[i];
        array[i] = array[j];
        array[j] = t;
        return array;
    }


    public void in(T[] array)
    {
        for (T type : array)
        {
            System.out.println(type);
        }
    }

    public static void main(String[] args)
    {
        Swap swap = new Swap();
        Integer[] intArrays = {-1,2,3,14,5,12,-3};
        swap.in(swap.swapIndex(intArrays,1,3));

    }
}
