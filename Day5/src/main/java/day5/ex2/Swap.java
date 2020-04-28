package day5.ex2;

import java.util.Arrays;

public class Swap
{
    public static  <T extends Number> void swapIndex( T[] array, int i , int j )
    {
        T t ;
        t = array[i];
        array[i] = array[j];
        array[j] = t;

        for (T type : array)
        {
            System.out.println(type);
        }
    }

    public static void main(String[] args)
    {
        Integer[] intArrays = {-1,2,3,14,5,12,-3};
        swapIndex(intArrays,1,3);
    }
}
