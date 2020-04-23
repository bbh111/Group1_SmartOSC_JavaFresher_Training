import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ExDay1 ex = new ExDay1();
        int choice = 0;
        do
        {
            System.out.println("1.Lấy ký tự đầu và cuối của chuỗi Hello");
            System.out.println("2.Sử dụng BigInteger để tính 2^1024");
            System.out.println("3.Đếm ngược về 0");
            System.out.println("4.Chuyển đổi chuỗi Hello về ASCII");
            System.out.println("5.Sử dụng đệ quy cho ví dụ 4");
            System.out.println("6.Lấy n số ký tự từ trái sang phải");
            System.out.println("7.Lấy n số ký tự từ phải sang trái");
            System.out.println("8.Xóa n số ký tự từ trái sang phải");
            System.out.println("9.Xóa n số ký tự từ phải sang trái");
            System.out.println("10.Exit");

            try
            {
                System.out.print("Nhập bài tập muốn xem: ");
                String tmp = sc.nextLine();
                choice = Integer.parseInt(tmp);
            }catch (NumberFormatException e)
            {
                    System.out.println("Vui lòng nhập số");
            }

//            if(choice == 1)
//            {
//                ex.getCharacter();
//                break;
//            }
//            if(choice == 2)
//            {
//                ex.calculate();
//                break;
//            }
            switch (choice)
            {
                case 1:
                    ex.getCharacter();
                    break;
                case 2:
                    ex.calculate();
                    break;
                case 3:
                    ex.countDown();
                    break;
                case 4:
                    ex.convertUnicode();
                    break;
                case 5:
                case 6:
                    Scanner sc1 = new Scanner(System.in);
                    Scanner sc2 = new Scanner(System.in);

                    System.out.print("Nhập chuỗi: ");
                    String inputLeftTake = sc1.nextLine();

                    System.out.print("Nhập số ký tự cần lấy từ trái sang phải: ");
                    int a = sc2.nextInt();

                    ex.takeLeft(a, inputLeftTake);
                    break;
                case 7:
                    Scanner sc3 = new Scanner(System.in);
                    Scanner sc4 = new Scanner(System.in);

                    System.out.println("Nhập chuỗi: ");
                    String inputRightTake = sc3.nextLine();

                    System.out.print("Nhập số ký tự cần lấy từ phải sang trái: ");
                    int b = sc4.nextInt();

                    ex.takeRight(b, inputRightTake);
                    break;
                case 8:
                    Scanner sc5 = new Scanner(System.in);
                    Scanner sc6 = new Scanner(System.in);

                    System.out.print("Nhập chuỗi: ");
                    String inputLeftDrop = sc5.nextLine();

                    System.out.print("Nhập số ký tự cần xóa từ trái sang phải: ");
                    int c = sc6.nextInt();

                    ex.takeLeft(c, inputLeftDrop);
                    break;
                case 9:
                    Scanner sc7 = new Scanner(System.in);
                    Scanner sc8 = new Scanner(System.in);

                    System.out.print("Nhập chuỗi: ");
                    String inputRightDrop = sc7.nextLine();

                    System.out.print("Nhập số ký tự cần xóa từ trái sang phải: ");
                    int d = sc8.nextInt();

                    ex.takeLeft(d, inputRightDrop);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn các số ở trên");
                    break;
            }
        }while (true);
    }
}
