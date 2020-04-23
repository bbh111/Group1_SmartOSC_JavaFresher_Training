package day1;

import java.util.Scanner;

public class Exercise {
    static Functions f = new Functions();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.doMain();
    }

    void doMain() {
        int choice = -1;
        do {
            System.out.println("1.Get the first character of String");
            System.out.println("2.Get the last character of String");
            System.out.println("3.Use BigDecimal to compute huge number");
            System.out.println("4.Countdown number to 0");
            System.out.println("5.Convert character in String into their ASCII");
            System.out.println("6.Recursive Function: Function 5");
            System.out.println("7.Get n characters of the First Left side of String");
            System.out.println("8.Get n characters of the First Right side of String");
            System.out.println("9.Drop n characters of the First Left side of String");
            System.out.println("10.Drop n characters of the First Right side of String");
            System.out.println("11.Exit");

            do {
                try {
                    System.out.println("Please choose 1 option !!!");
                    String tmp = sc.nextLine();
                    choice = Integer.parseInt(tmp);
                } catch (NumberFormatException e) {
                    System.out.println("Must be a number");
                }
            } while (choice <= 0);


            switch (choice) {
                case 1:
                    System.out.println("Enter your String:");
                    String s = sc.nextLine();
                    System.out.println("First char is: " + f.getFirstChar(s));
                    break;
                case 2:
                    System.out.println("Enter your String:");
                    String s1 = sc.nextLine();
                    System.out.println("Last char is: " + f.getLastChar(s1));

                    break;
                case 3:
                    System.out.println("Enter the first number: ");
                    int num1 = 0;
                    do {
                        try {
                            num1 = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Must be a number");
                        }
                    } while (num1 <= 0);
                    System.out.println("Enter the second number: ");
                    int num2 = 0;
                    do {
                        try {
                            num2 = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Must be a number");
                        }
                    } while (num2 <= 0);
                    System.out.println("Result is: " + f.getResult(num1, num2));

                    break;
                case 4:
                    System.out.println("Countdown Function: ");
                    System.out.println("Enter your countdown number: ");
                    int num3 = 0;
                    do {
                        try {
                            num3 = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Must be a number");
                        }
                    } while (num3 <= 0);
                    f.countDown(num3);
                    break;
                case 5:
                    System.out.println("Convert to ASCII");
                    System.out.println("Enter your String:");
                    String s5 = sc.nextLine();
                    System.out.println("Convert successfully: " + f.convertString(s5));

                    break;
                case 6:
                    System.out.println("Recursive function:");
                    System.out.println("Enter your String: ");
                    String s6 = sc.nextLine();
                    System.out.println("Convert succesfully:" +  f.convertToASCII(s6));
                    break;
                case 7:
                    System.out.println("Enter your String");
                    String s7 = sc.nextLine();
                    System.out.println("Enter number n");
                    int n7 = 0;
                    n7 = inputData(s7, n7);
                    System.out.println("New String: " + f.getNLeftFirstElement(n7, s7));
                    break;
                case 8:
                    System.out.println("Enter your String");
                    String s8 = sc.nextLine();
                    System.out.println("Enter number n");
                    int n8 = 0;
                    n8 = inputData(s8, n8);
                    System.out.println("New String : " + f.getNRightFirstElement(n8, s8));
                    break;
                case 9:
                    System.out.println("Enter your String");
                    String s9 = sc.nextLine();
                    System.out.println("Enter number n");
                    int n9 = 0;
                    n9 = inputData(s9, n9);
                    System.out.println("New String : " + f.dropNLeftFirstElement(n9, s9));
                    break;
                case 10:
                    System.out.println("Enter your String");
                    String s10 = sc.nextLine();
                    System.out.println("Enter number n");
                    int n10 = 0;
                    n10 = inputData(s10, n10);
                    System.out.println("New String : " + f.dropNRightFirstElement(n10, s10));
                    break;
            }
        } while (choice != 11);
    }

    private int inputData(String s7, int n7) {
        do {
            try {
                n7 = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Must be a number");
            }
            if (n7 > 0 && n7 <= s7.length()) {
                break;
            } else {
                System.out.println("Vui lòng nhập n <=" + s7.length());
            }
        } while (true);
        return n7;
    }
}




