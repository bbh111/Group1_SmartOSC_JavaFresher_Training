package main.java.day4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Controller controller = new Controller();
        System.out.println("1. Bài 1");
        System.out.println("2. Bài 2");
        System.out.println("3. Bài 3");
      int option = Integer.valueOf(new Scanner(System.in).nextLine());
      switch (option){
          case 1:
              controller.bai1();
              break;
          case 2:
              controller.bai2(".exe");
              break;
          case 3:
              controller.bai3();
              break;
      }
    }
}
