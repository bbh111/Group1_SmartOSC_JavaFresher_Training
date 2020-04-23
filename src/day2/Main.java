package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public Controller c = new Controller();
    BankAccount bankAccount = new BankAccount();
    public static void main(String[] args) {
        Main m = new Main();
        m.doMain();
    }

    private void doMain() {
        String choice = "-1";
        do {
            options();
            int choose = -1;
            do {
                try {
                    System.out.println("Your choice is :");
                    choice = sc.nextLine();
                    choose = Integer.parseInt(choice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Must a number");
                }
            } while (true);

            switch (choose) {
                case 1:
                    int size1 = inputSize();
                    System.out.println("Your array from 0 to " + size1 + " is: " + Arrays.toString(c.getRandomArray(size1)));
                    break;
                case 2:
                    int size2 = inputSize();
                    Integer[] array = c.getRandomArray(size2);
                    System.out.println("Your origin Array is: " + Arrays.toString(array));
                    System.out.println("New swaped array is: " + Arrays.toString(c.exchangeTwoAdjacentElement(array)));
                    break;
                case 3:
                    int size3 = inputSize();
                    Integer[] array3 = c.randomFromTo(-5, 5, size3);
                    System.out.println("Your origin Array is: " + Arrays.toString(array3));
                    System.out.println("Exchanged array is: " + Arrays.toString(c.changePositiveAndNegative(array3)));
                    break;
                case 4:
                    int size4 = inputSize();
                    Double[] array4 = new Double[size4];
                    for (int i = 0; i < size4; i++) {
                        System.out.println("Enter number "+i);
                        array4[i] = sc.nextDouble();
                    }
                    System.out.println("Average value of array is: " + c.computeAverageOfArray(array4));
                    break;
                case 5:
                    int size5 = inputSize();
                    Integer[] array5 = c.randomFromTo(-5, 10, size5);
                    System.out.println("Your origin Array is: " + Arrays.toString(array5));
                    System.out.println("Your array after sorting order by descending is: " + Arrays.toString(c.sortDecending(array5)));
                    break;
                case 6:
                    int size6 = inputSize();
                    Integer[] array6 = c.randomFromTo(4, 6, size6);
                    System.out.println("Your origin Array is: " + Arrays.toString(array6));
                    c.removeDuplicateElements(array6);
                    break;
                case 7:
                    System.out.println("All TimeZone of America : ");
                    c.getAllTimeZonesInAmerica();
                    break;
                case 8:
                    int choice8 = -1;
                    String raw_choice8 = "-1";
                    do {
                        System.out.println("Welcome to Bank Program");
                        System.out.println("1.Deposit\n2.Withdraw\n3.View Balance\n4.Exit");
                        try {
                            raw_choice8 = sc.nextLine();
                            choice8 = Integer.parseInt(raw_choice8);
                        } catch (NumberFormatException e) {
                            System.out.println("Must be a number");
                        }
                        switch (choice8) {
                            case 1:
                                System.out.println("Enter your money which you want to deposit");
                                double money = sc.nextDouble();
                                sc.nextLine();
                                bankAccount.depositMoney(money);
                                System.out.println("Successfully");
                                break;
                            case 2:
                                System.out.println("Enter your money which you want to withdraw:");
                                double moneyWithdraw = sc.nextDouble();
                                sc.nextLine();
                                bankAccount.withdrawMoney(moneyWithdraw);
                                break;
                            case 3:
                                System.out.println("You have $" + bankAccount.getBalance());
                                break;
                        }
                    } while (choice8 != 4);
                    break;
                case 9:
                    System.out.println("Enter hour: ");
                    try{
                        int hour = sc.nextInt();
                        if(hour<0 ||hour>23){
                            throw  new Exception();
                        }
                        System.out.println("Enter minutes:");
                        int minutes = sc.nextInt();
                        if(minutes<0||minutes>59){
                            throw  new Exception();
                        }
                        Time t = new Time(hour,minutes);
                        // Assume time now is 7h 10p
                        Time now = new Time(7,10);
                        if(now.before(t)){
                            System.out.println("Thời gian vừa nhập trước "+now.getHour()+"h:"+now.getMinutes()+"p");
                        }else{
                            System.out.println("Thời gian vừa nhập sau "+now.getHour()+"h:"+now.getMinutes()+"p");
                        }
                        System.out.println("--------------------------------------");
                        System.out.println("After "+now.countMinutes()+" minus after MidNight");
                    }catch (Exception e){
                        System.out.println("Hour must be > 0 and < 23 And Minutes must be >0 and <59");
                    }
                    break;
                case 10:
                    System.out.println("Enter yourname (Must follow by rule: firstname_lastname)");
                    String name = sc.nextLine();
                    Person p = new Person(name);
                    p.checkName(name);
                    System.out.println("Your Firstname: "+p.getFirstName());
                    System.out.println("Your Lastname: "+p.getLastName());
                    break;
            }
        } while (Integer.parseInt(choice) != 11);
    }

    public void options() {
        System.out.println("============================================================");
        System.out.println("Excercise 22-4-2020");
        System.out.println("1.Create a random array");
        System.out.println("2.Swap adjacent elements in an array");
        System.out.println("3.Separate array into 2 parts: positive and negative values");
        System.out.println("4.Compute average of an double Array");
        System.out.println("5.Sort array order by descending");
        System.out.println("6.Removes duplicate elements in array");
        System.out.println("7.Make a collection of America TimeZone");
        System.out.println("8.Bank Program");
        System.out.println("9.Time Program");
        System.out.println("10.Person Data");
        System.out.println("11.Exit");
        System.out.println("Please choose 1 option !!!");
        System.out.println("========================================================");
    }

    public int inputSize() {
        System.out.println("Enter the size of Array: ");
        String raw_size = "-1";
        int size = -1;
        do {
            try {
                raw_size = sc.nextLine();
                size = Integer.parseInt(raw_size);
                if (size < 1) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Must be positive number");
            }
        } while (Integer.parseInt(raw_size) < 1);
        return size;
    }
}

