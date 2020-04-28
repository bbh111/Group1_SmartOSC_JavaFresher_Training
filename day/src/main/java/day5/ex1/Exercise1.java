package day5.ex1;

public class Exercise1 {
    public static <T extends Integer> boolean checkIsPrimeNumber(T t) {
        int count = 0;
        for (int i = 1; i <= t.intValue(); i++) {
            if (t.intValue()%i==0) count ++;
        }
        return count == 2;
    }

    public static <T extends Integer> boolean checkIsOddNumber(T t) {
        return t.intValue()%2 != 0;
    }

    public static <T extends Integer> void countOddNumbers(T[] t) {
        int countOddNumbers = 0;
        int countPrimeNumbers = 0;
        for (T e :
                t) {
            if (checkIsOddNumber(e)) countOddNumbers++;
            if (checkIsPrimeNumber(e)) countPrimeNumbers++;
        }
        System.out.println(String.format("amount of odd numbers in array: %d", countOddNumbers));
        System.out.println(String.format("amount of prime numbers in array: %d", countPrimeNumbers));
    }
}
