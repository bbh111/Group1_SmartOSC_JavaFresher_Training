package day3;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();


        int option = 0;
        do {
            controller.menu();
            option = controller.valid.checkTime("Enter your choose: ", Integer.MIN_VALUE, Integer.MAX_VALUE, "Wrong");
            switch (option) {
                case 1:
                    controller.convertUnit();
                    break;
                case 2:
                    controller.convertUnitConversion();
                    break;
                case 3:
                    controller.checkingAccount();
                    break;
                case 4:
                    controller.savingAccount();
                    break;
                case 5:
                    controller.labelPoint();
                    break;
                case 6:
                    controller.shapeClass();
                    break;
            }
        } while (option >= 1 && option <= 6);

    }
}
