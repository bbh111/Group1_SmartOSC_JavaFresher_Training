package day2;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {

    //Random from inclusive to exclusive
    private int rand(int begin, int end) {
        Random r = new Random();
        return r.nextInt(end - begin) + begin;
    }

    public Integer[] randomFromTo(int begin, int end,int numberOfElements){
        Integer[] rs = new Integer[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            rs[i] = rand(begin, end);
        }
        return rs;
    }

    //random an Double array

    // Cau 1
    public Integer[] getRandomArray(int numberOfElements) {
        Integer[] rs = new Integer[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            rs[i] = rand(0, numberOfElements);
        }
        return rs;
    }

    // Cau 2
    public Integer[] exchangeTwoAdjacentElement(Integer[] originArray) {
        int temp;
        for (int i = 0; i < originArray.length - 2; i += 2) {
            temp = originArray[i + 1];
            originArray[i + 1] = originArray[i];
            originArray[i] = temp;
        }
        return originArray;
    }

    //Cau 3
    public Integer[] changePositiveAndNegative(Integer[] orriginArray) {
        int count = 0;
        for (Integer integer : orriginArray) {
            if (integer <= 0) {
                count += 1;
            }
        }
        Integer[] negativeArray = new Integer[count];
        Integer[] positiveArray = new Integer[orriginArray.length - count];
        int idx1 = 0;
        int idx2 = 0;
        for (Integer integer : orriginArray) {
            if (integer <= 0) {
                for (int j = 0; j < negativeArray.length; j++) {
                    negativeArray[idx1] = integer;
                    break;
                }
                idx1++;
            } else {
                for (int j = 0; j < positiveArray.length; j++) {
                    positiveArray[idx2] = integer;
                }
                idx2++;
            }
        }


        Integer[] rsArray = new Integer[orriginArray.length];
        int tmp = 0;
        for (Integer integer : positiveArray) {
            rsArray[tmp] = integer;
            tmp += 1;
        }
        for (Integer integer : negativeArray) {
            rsArray[tmp] = integer;
            tmp += 1;
        }
        return rsArray;
    }



    // Cau 4
    public double computeAverageOfArray(Double[] array) {
        double sum = 0;
        for (double element : array
        ) {
            sum += element;
        }
        return sum / array.length;
    }

    // Cau 5 Bubble sort
    public Integer[] sortDecending(Integer[] originArray) {
        Arrays.sort(originArray,Collections.reverseOrder());
        return originArray;
    }

    //Cau 6
    public void removeDuplicateElements(Integer[] originArray) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(originArray));
        System.out.println("List without duplicate elements: ");
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
    }

    //Cau 7
    public void getAllTimeZonesInAmerica() {
        String[] timeZone = java.util.TimeZone.getAvailableIDs();
        String prefix = "America/";
        int count = 0;
        for (String s : timeZone
        ) {
            if (s.contains(prefix)) {
                count += 1;
            }
        }
        int i = 0;
        String[] rs = new String[count];
        for (String s : timeZone
        ) {
            if (s.contains(prefix)) {
                rs[i] = s.replace(prefix,"");
                i += 1;
            }
        }
        System.out.println(Arrays.toString(rs));

    }

    //Cau 8

}
