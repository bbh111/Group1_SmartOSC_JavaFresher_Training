package day5;

import java.util.*;

public  class Exercise1 {
    public <T extends Integer> Hashtable countOddAndPrimeNumber(Collection<T> inputArray){
        HashMap<String ,Integer> count = new HashMap<>();
        HashMap<String,List<T>> rs = new HashMap<>();
        Hashtable result = new Hashtable();
        int countOdd = 0;
        int countPrime = 0;
        List<T> lstOdd = new ArrayList<>();
        List<T>lstPrime = new ArrayList<>();
        for (T elements: inputArray
             ) {
            if (elements.intValue() % 2 != 0) {
                countOdd += 1;
                lstOdd.add(elements);
            }
            if(checkPrime(elements.intValue())){
                countPrime+=1;
                lstPrime.add(elements);
            }
        }
        count.put("odd",countOdd);
        count.put("prime",countPrime);
        rs.put("oddNumber",lstOdd);
        rs.put("primeNumber",lstPrime);
        result.putAll(count);
        result.putAll(rs);
        return result;
    }

    public  boolean checkPrime(int input){
        int count = 0;
        if(input<2)return false;
        if(input==2) return true;
        for (int i = 2;i<input/2;i++){
            if(input%i==0){
                count+=1;
            }
        }
        if(count!=0) return false;
        return true;
    }
}
