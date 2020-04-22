package day2;

import java.util.*;

public class Controller {
    Scanner sc = new Scanner(System.in);
    Valid valid = new Valid();
    Random random = new Random();


    public void example1() {
        int number = valid.isIntNumber("Enter size of array: ");
        System.out.println("-----Example1: Value of element in array is random-----");
        int[] arrInt = getArray2(0, number, number);
        System.out.println("All values random in array is: ");
        displayArr(arrInt);

    }

    public void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public void example2() {
        System.out.println("-----Example2: Swap adjacent elements of an array of integers -----");
        int size = valid.isIntNumber("Enter size of array: ");
        int[] arrDomain = getArray2(-20, size, 100); // random element from -20 to 100;
        System.out.println("Array in first time");
        displayArr(arrDomain);
        System.out.println();
        System.out.println("Array after swap");
        for (int i = 0; i < arrDomain.length; i++) {
            if (i + 1 < arrDomain.length) { // check the next index is out of range yet.
                int valueTemp = swap(i, arrDomain, i + 1);
                i = valueTemp + 1; // continue with index++;
            }
        }
        displayArr(arrDomain);
    }

    public void example3() {
        System.out.println("-----Example 3: Display positive number first and negative number is second-----");

        int size = valid.isIntNumber("Enter size of array: ");
        int[] arrDomain = getArray2(-20, size, 100);
        ArrayList<Integer> arrPos = new ArrayList<>();
        ArrayList<Integer> arrNeg = new ArrayList<>();
        for (int i : arrDomain) {
            if (i > 0) {
                arrPos.add(i);
            } else {
                arrNeg.add(i);
            }
        }
        //Display array
        System.out.println("Array in first time: ");
        displayArr(arrDomain);
        System.out.println();
        System.out.println("Array after process: ");
        arrDomain = addArray(arrDomain, arrPos, arrNeg);
        displayArr(arrDomain);
    }

    public int[] getArray2(int min, int size, int max) {

        int[] arrInt = new int[size];
        for (int i = 0; i < size; i++) {
            arrInt[i] = min + random.nextInt(max);
        }
        return arrInt;
    }

    public int[] addArray(int[] arrSource, ArrayList<Integer>... array) {
        int length = arrSource.length;
        int index = 0;
        arrSource = new int[length];
        for (ArrayList<Integer> temp : array) {
            for (int i : temp) {
                arrSource[index++] = i;
            }
        }
        return arrSource;
    }

    public int swap(int x, int[] arr, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return x;
    }

    public double[] getArray3(int min, int size, double max) {

        double[] arrInt = new double[size];
        for (int i = 0; i < size; i++) {
            arrInt[i] = random.nextDouble();
        }
        return arrInt;
    }

    public void example4() {
        System.out.println("-----Example 4: The average of Array-----");
        int size = valid.isIntNumber("Enter size of array: ");
        double[] array = getArray3(-20, size, 100);
        Double sum = 0.0;
        int countElement = 0;
        for (Double x : array) {
            sum += x;
            countElement++;
        }

        for (double x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();
        double resut = sum / countElement;
        System.out.println("The average of Array is: " + resut);
    }

    public void example5() {
        System.out.println("-----Example 5: Rearrange the elements of Array-----");
        int size = valid.isIntNumber("Enter size of array: ");
        Integer[] arrDomain = new Integer[size];
        for (int i = 0; i < size; i++) {
            arrDomain[i] = random.nextInt(100);
        }
        System.out.println("Array in first time: ");
        display(arrDomain);
        System.out.println("Array is after sort: ");
        Arrays.sort(arrDomain, Collections.reverseOrder());
        display(arrDomain);
    }

    public void display(Object[] array) {
        for (Object i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public void example6() {
        System.out.println("-----Example 6: Remove element is duplicate: -----");
        int size = valid.isIntNumber("Enter size of array: ");
        int[] array = getArray2(-20, size, 100);
        System.out.println("This is array in first time: ");
        displayArr(array);
        System.out.println("After remove element is duplicate: ");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) { // get distinc element in array
            if (!integers.contains(array[i])) {
                integers.add(array[i]);
            }
        }
        array = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) { // ReUpdate array;
            array[i] = integers.get(i);
        }
        displayArr(array);
    }

    public void example7() {
        System.out.println("-----Example 7: Get time zone in America-----");
        String[] list = TimeZone.getAvailableIDs();
        List<String> strings = new ArrayList<>();
        for (String y : list) {
            if (y.contains("America")) {
                String[] temp = y.split("/");
                for (int i = 0; i < temp.length; i++) { //loop all element in array
                    if (temp[i].equals("America")) { // Skip word "America"
                        if (!strings.contains(temp[i])) { // check duplicate element
                            strings.add(temp[i]);
                        }
                    }
                }
            }
        }
        //sort element
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(" all time zones");
        list = new String[strings.size()];
        int index = 0;
        for (String temp : strings) {
            list[index++] = temp;
        }
        //display alll element
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void example8() {
        System.out.println("-----Example 8-----");
        BankAccount bankAccount = new BankAccount(10000); //default balance is 10000
        System.out.println("You want to :");
        System.out.println("1- deposit ");
        System.out.println("2- withdraw");
        int option = valid.isIntNumber("Enter your choose: ");
        switch (option) {
            case 1:
                bankAccount.deposit();
                break;
            case 2:
                bankAccount.withdraw();
                break;
        }
    }

    public void example9() {
        System.out.println("-----Example 9-----");
        System.out.println();
        int hoursCur = valid.checkTime("Enter the first hours: ", 0, 23, "Range of Hour must from 0 to 23: ");
        int minutesCur = valid.checkTime("Enter the first minutes: ", 0, 59, "Range of Minute must from 0 to 59: ");

        int hoursCheck = valid.checkTime("Enter hours need to check: ", 0, 23, "Range of Hour must from 0 to 23: ");
        int minutesCheck = valid.checkTime("Enter minutes need to check: ", 0, 59, "Range of Minute must from 0 to 59: ");

        Time time = new Time(hoursCheck, minutesCheck);
        System.out.println("this time comes before the other: " + time.before(hoursCur, minutesCur));  // check before

    }

    public void example10() {
        System.out.println("-----Example 10-----");
        System.out.println();
        int hoursCur = valid.checkTime("Enter the first hours: ", 0, 24, "Range of Hour must from 0 to 23: ");
        int minutesCur = valid.checkTime("Enter the first minutes: ", 0, 59, "Range of Minute must from 0 to 59: ");

        int hoursCheck = valid.checkTime("Enter hours need to check: ", 0, 24, "Range of Hour must from 0 to 23: ");
        int minutesCheck = valid.checkTime("Enter minutes need to check: ", 0, 59, "Range of Minute must from 0 to 59: ");

        Time time = new Time(hoursCheck, minutesCheck);
        System.out.println("this time comes before the other: " + time.before(hoursCur, minutesCur));  // check before
    }

    public void menu() {
        System.out.println("***** 1.Example 1 ");
        System.out.println("***** 2.Example 2 ");
        System.out.println("***** 3.Example 3");
        System.out.println("***** 4.Example 4 ");
        System.out.println("***** 5.Example 5 ");
        System.out.println("***** 6.Example 6 ");
        System.out.println("***** 7.Example 7 ");
        System.out.println("***** 8.Example 8 ");
        System.out.println("***** 9.Example 9 ");
        System.out.println("***** 10.Example 10 ");
        System.out.println("***** 11.Example 11 ");
    }

    public void example11() {
        System.out.println("Enter fullName");
        String fullName = sc.nextLine();
        Person person = new Person(fullName);
        person.display();
    }

}
