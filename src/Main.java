import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        int option = 0;
        do{
            controller.menu();
            option = Integer.valueOf(new Scanner(System.in).nextLine());

            switch (option){
                case 1:
                    controller.Ex1();
                    break;
                case 2:
                    controller.Ex2();
                    break;
                case 3:
                    controller.Ex3();
                    break;
                case 4:
                    controller.Ex4();
                    break;
                case 5:
                    System.out.println("Enter string: ");
                    String temp = controller.sc.nextLine();
                    controller.Ex5(temp);
                    System.out.println(controller.resultEx5);
                    break;
                case 6:
                    controller.StringFunction();
                    break;
            }

        }while (option >= 1 && option <= 5 );


    }
}
