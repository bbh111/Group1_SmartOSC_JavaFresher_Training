package day5;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String choice = "-1";
        int choose = -1;
        do{
            doMain();
            System.out.println("Enter your choice....");
            choose = checkInput();
            switch (choose){
                case 1:
                    String raw_choice1 = "-1";
                    int choice1 = -1;
                    Exercise1 ex1 = new Exercise1();
                    do{
                        System.out.println("1.You choose an Array");
                        System.out.println("2.You choose a List");
                        System.out.println("3.Exit");
                        System.out.println("What is your choice ?");
                        choice1 = checkInput();
                        switch (choice1){
                            case 1:
                                System.out.println("You must input an INTEGER array");
                                System.out.println("Enter size of array: ");
                                int size1 = sc.nextInt();
                                sc.nextLine();
                                Integer[] arr = new Integer[size1];
                                for (int i =0;i<size1;i++){
                                    System.out.println("Array["+i+"]");
                                    arr[i] = sc.nextInt();
                                }
                                Hashtable rs = ex1.countOddAndPrimeNumber(Arrays.asList(arr));
                                System.out.println("Number of odd number: "+rs.get("odd")+"["+rs.get("oddNumber")+"] and "+rs.get("prime")+" numbers of prime is" +
                                        "["+rs.get("primeNumber")+"]");
                                break;
                            case 2:
                                System.out.println("Start enter your INTEGER list, press x if you want to end list");
                                List<Integer> lst = new ArrayList<>();
                                String choice2 = "-1";
                                do{
                                    try{
                                        lst.add(Integer.parseInt(sc.nextLine()));
                                    }catch (NumberFormatException e){
                                        break;
                                    }
                                }while (!choice2.equals("x"));
                                Hashtable rs2 = ex1.countOddAndPrimeNumber(lst);
                                System.out.println("Number of odd number: "+rs2.get("odd")+"["+rs2.get("oddNumber")+"] and "+rs2.get("prime")+" numbers of prime is" +
                                        "["+rs2.get("primeNumber")+"]");
                                break;
                        }

                    }while (choice1!=3);
                    break;
                case 2:
                    System.out.println("====== Enter Array ======");
                    System.out.println("Enter size of array");
                    int size2 = sc.nextInt();
                    Double[] lst = new Double[size2];
                    for (int i=0;i<size2;i++){
                        System.out.println("Array["+i+"]");
                        lst[i] = sc.nextDouble();
                    }
                    System.out.println("Enter begin position: ");

                    break;
            }


        }while (Integer.parseInt(choice)!=5);

    }
    static void doMain(){
        System.out.println("========== Bài tập day 5 ============");
        System.out.println("1.Count number of odd and prime number in a Collection");
        System.out.println("2.Exchange Element in an array");
        System.out.println("3.Find maximal Element in the range of a list");
        System.out.println("4.Check code");
        System.out.println("5.Exit");
    }

    static int  checkInput(){
      Scanner sc = new Scanner(System.in);
      String choice = "-1";
      int choose = -1;
        try{
            choice = sc.nextLine();
            choose = Integer.parseInt(choice);
        }catch (NumberFormatException e){
            System.out.println("Must be a number");
        }
        return choose;
    }
}
