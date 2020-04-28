package day5;

import java.util.Collection;

public class Exercise2 {
    public <T> boolean exchangeValue(T[] input, int position1, int position2) {
        T temp;
        if (position2 > input.length - 1 || position1 > input.length - 1) return false;
        temp = input[position1] ;
        input[position1] = input[position2];
        input[position2] = temp;
        return true;
    }
}
