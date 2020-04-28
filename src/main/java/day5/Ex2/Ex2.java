package main.java.day5.Ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex2<T> {

    private T firstNumber;
    private T secondNumber;
    private T[] arr;

    public Ex2() {

    }

    public Ex2(T firstNumber, T secondNumber, T[] arr1) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        arr = arr1;
    }

    public void exchangePos(){
       int indexOfFirst = contain(firstNumber);
       int indexOfSecond = contain(secondNumber);

       if(indexOfFirst != -1 && indexOfSecond != -1){
            swap(arr[indexOfFirst],arr[indexOfSecond]);
       }
    }
    void swap(T f,T l){
        T temp = f;
        f = l;
        l = temp;
    }

    public int contain(T value){
       for(int i = 0; i<arr.length;i++){
           if(arr[i].equals(value)){
               return i;
           }
       }
       return -1;
    }

    public void display(){
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5,6,22,7,9,17};
        Ex2<Integer> ex2 = new Ex2<Integer>(2,5,arr);
        ex2.exchangePos();
        ex2.display();

    }

}
