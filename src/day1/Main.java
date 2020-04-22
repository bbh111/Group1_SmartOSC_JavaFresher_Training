package day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        int option = 3;
        do{
            controller.menu();
            option = Integer.valueOf(new Scanner(System.in).nextLine());
            switch (option){
                case 1:
                    controller.ex1();
                    break;
                case 2:
                    controller.ex2();
                    break;
                case 3:
                    controller.ex3();
                    break;
                case 4:
                    controller.ex4();
                    break;
                case 5:
                    System.out.println("Enter string: ");
                    String temp = controller.sc.nextLine();
                    controller.setResultEx5(1L);
                    controller.ex5(temp);
                    System.out.println(controller.resultEx5);
                    break;
                case 6:
                    controller.stringFunction();
                    break;
            }

        }while (option >= 1 && option <= 5 );


    }
}
