package main.java.day5.ex1;

import java.util.List;

public class Ex1<T extends Integer> {
    public void count(T[] numbers) {
        int countPrimeNumber = 0;
        int countOddInteger = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i])){
                countPrimeNumber++;
            }
            if(isOddNumber(numbers[i])){
                countOddInteger++;
            }
        }
        System.out.printf("Odd Number is: %d, PrimeNumber is: %d",countOddInteger,countPrimeNumber);
    }
    boolean isOddNumber(int number){
      if(number % 2 != 0){
          return false;
      }
      return true;
    };
    boolean isPrime(int number2) {
        if (number2 < 2) {
            return false;
        } else {
            for (int i = 2; i <= (float) Math.sqrt(number2); i++) {
                if (number2 % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Integer[] inters = {1,2,3,4,5,6,7,8,9,10,12,145};
        ex1.count(inters);
    }
}
