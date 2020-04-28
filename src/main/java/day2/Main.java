package main.java.day2;

public class Main {
    public static void main(String[] args) {
        Controller con = new Controller();
        int option = 0;
        do {
            con.menu();
            option = con.valid.checkTime("Enter your choose: ", 1, 11, "Wrong");
            switch (option) {
                case 1:
                    con.example1();
                    break;
                case 2:
                    con.example2();
                    break;
                case 3:
                    con.example3();
                    break;
                case 4:
                    con.example4();
                    break;
                case 5:
                    con.example5();
                    break;
                case 6:
                    con.example6();
                    break;
                case 7:
                    con.example7();
                    break;
                case 8:
                    con.example8();
                    break;
                case 9:
                    con.example9();
                    break;
                case 10:
                    con.example10();
                    break;
                case 11:
                    con.example11();
                    break;
            }
        } while (option >= 1 && option <= 11);


    }
}
