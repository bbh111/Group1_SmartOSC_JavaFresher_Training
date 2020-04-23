import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Functions fs = new Functions();
        BankAccount ba = new BankAccount();
        int choice = 0;
        do
        {
            System.out.println("Bài 1");
            System.out.println("Bài 2");
            System.out.println("Bài 3");
            System.out.println("Bài 4");
            System.out.println("Bài 5");
            System.out.println("Bài 6");
            System.out.println("Bài 7");
            System.out.println("Bài 8");
            System.out.println("Bài 9");
            System.out.println("Bài 10");
            System.out.println("11.Exit");

            try
            {
                System.out.print("Nhập bài tập muốn xem: ");
                String tmp = sc.nextLine();
                choice = Integer.parseInt(tmp);
            }catch (NumberFormatException e)
            {
                System.out.println("Vui lòng nhập số");
            }

            switch (choice)
            {
                case 1:
                    fs.printArraysRandom();
                    System.exit(0);
                    break;
                case 2:
                    fs.swapArrays();
                    System.exit(0);
                    break;
                case 3:
                    fs.sortPositiveNegativeNumbers();
                    System.exit(0);
                    break;
                case 4:
                    fs.averageArrays();
                    System.exit(0);
                    break;
                case 5:
                    fs.reverseSortedArrays();
                    System.exit(0);
                    break;
                case 6:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Nhập số phần tử của mảng: ");
                    int n = sc1.nextInt();
                    Integer[] array = new Integer[n];
                    for (int i = 0; i < array.length; i++)
                    {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.print("Nhập phần thử thứ " + i + ": ");
                        array[i] = sc2.nextInt();
                    }
                    System.out.println(Arrays.toString(fs.removeDuplicates(array)));
                    System.exit(0);
                    break;
                case 7:
                    String[] timezone = fs.getAllTimeZoneByPrefixName();
                    for (String s: timezone)
                    {
                        System.out.println(s);
                    }
                    System.exit(0);
                    break;
                case 8:
                    do {
                        int choice1 = 0;
                        try
                        {
                            System.out.println("1. Gửi tiền");
                            System.out.println("2. Rút tiền");
                            System.out.println("3. Xem số dư");
                            System.out.println("4. Exit");
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
                                ba.depositMoney(money);
                                System.out.println("Gửi tiền thành công");
                                break;
                            case 2:
                                System.out.println("Nhập số tiền bạn muốn rút:");
                                double moneyWithdraw = sc.nextDouble();
                                sc.nextLine();
                                ba.withdrawMoney(moneyWithdraw);
                                break;
                            case 3:
                                System.out.println("Bạn có " + ba.getBalance() + " VNĐ");
                                break;
                            case 4:
                                System.exit(0);
                        }
                    }while(true);
                case 9:
                    try
                    {
                        System.out.print("Nhập giờ: ");
                        int hour = sc.nextInt();
                        if(hour<0 || hour>23)
                        {
                            throw  new Exception();
                        }
                        System.out.print("Nhập phút:");
                        int minutes = sc.nextInt();
                        if(minutes < 0 || minutes > 59)
                        {
                            throw  new Exception();
                        }
                        Time time = new Time();
                        time.time(hour,minutes);
                        Time now = new Time();
                        now.time(17,10);
                        if(now.before(time)){
                            System.out.println("Thời gian vừa nhập trước " + now.hour +"h:" + now.minutes+"m");
                        }else{
                            System.out.println("Thời gian vừa nhập sau " + now.hour +"h:" + now.minutes+"m");
                        }
                        System.out.println("Thời gian vừa nhập sau nửa đêm là: " + time.countMinutes() + " phút");
                    }catch (Exception e){
                        System.out.println("Vui lòng nhập giờ từ 0 đến < 23 , Nhập phút từ 0 đến 59");
                    }
                case 10:
                    System.out.println("Nhập tên");
                    String name = sc.nextLine();
                    Person p = new Person(name);
                    p.checkName(name);
                    System.out.println("Firstname: "+p.getFirstName());
                    System.out.println("Lastname: "+p.getLastName());
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn các số ở trên");
                    break;
            }
        }while (true);
    }
}
