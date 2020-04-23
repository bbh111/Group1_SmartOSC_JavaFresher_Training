package Ex3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        CheckingAccount ca = new CheckingAccount();
        Scanner sc = new Scanner(System.in);

        do {
            int choice1 = 0;
            try
            {
                System.out.println("1. Gửi tiền");
                System.out.println("2. Rút tiền");
                System.out.println("3. Exit");
                String tmp = sc.nextLine();
                choice1 = Integer.parseInt(tmp);
            }catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập số");
            }
            switch (choice1)
            {
                case 1:
                    System.out.print("Nhập số tiền bạn muốn gửi: ");
                    double money = sc.nextDouble();
                    sc.nextLine();
                    ca.depositMoneyCharges(money);
                    System.out.println("Gửi tiền thành công, phí trừ là 1$. Bạn có " + ca.getBalance() + "$");
                    break;
                case 2:
                    System.out.println("Nhập số tiền bạn muốn rút:");
                    double moneyWithdraw = sc.nextDouble();
                    sc.nextLine();
                    ca.withdrawMoneyCharges(moneyWithdraw);
                    System.out.println("Rút thành công, phí trừ là 1$. Bạn có " + ca.getBalance() + "$");
                    break;
                case 3:
                    System.exit(0);
            }
        }while(true);
    }
}
