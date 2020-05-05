package day5.ex1;

public class CountNumber
{
    public static  <T extends Integer> void printArray( T[] inputArray )
    {
        int countOddNumbers = 0;
        int countPrimeNumbers = 0;
        for ( T type : inputArray )
        {
            if(type.intValue() % 2 != 0)
            {
                countOddNumbers ++;
            }
            if (type.intValue() <= 1) {
                continue;
            }
            else {
                for (int i = 2; i <= Math.sqrt(type.intValue()); i++) {
                    if (type.intValue() % i == 0) {
                        countPrimeNumbers++;
                    }
                }
            }
        }
        System.out.println("Có " + countOddNumbers + " số lẻ");
        System.out.println("Có " + countPrimeNumbers + " số nguyên tố");
    }

    public static void main(String[] args)
    {
        Integer[] intArrays = {-1,2,3,14,5,12,-3};
        printArray(intArrays);
    }
}
