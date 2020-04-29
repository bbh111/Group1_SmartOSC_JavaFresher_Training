package day5.ex3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public <T extends Comparable<T>> T maximum(List<T> list,int begin,int end) {
        T max = list.get(0);
        for(int i = begin; i < end;i++){
            if(list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 22, 7, 9, 17};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Ex3 ex3 = new Ex3();
        double temp = ex3.maximum(Arrays.asList(doubleArray),0,3);
        System.out.println(temp);
    }
}
