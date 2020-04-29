package day2;

import java.util.Scanner;

public class Valid {
    Scanner scanner = new Scanner(System.in);

    public int isIntNumber(String text) {
        int numTemp = 0;
        while (true) {
            try {
                System.out.print(text);
                numTemp = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return numTemp;
    }

    public double enterDoubleNumber(double min, String text, double max) {
        double money = 0;
        while (true) {
            try {
                System.out.println(text);
                money = Double.valueOf(scanner.nextLine());
                if (money <= min || money >= max) {
                    throw new Exception("Must enter value is valid. ");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return money;
    }

    public int checkTime(String text, int min, int max, String error) {
        int numTemp = 0;
        while (true) {
            try {
                System.out.print(text);
                numTemp = Integer.parseInt(scanner.nextLine());
                if (numTemp < min || numTemp > max) {
                    throw new Exception(error);
                }
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return numTemp;
    }
}
