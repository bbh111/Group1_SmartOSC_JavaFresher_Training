import java.lang.reflect.Array;
import java.util.*;

public class Functions {
    public static void main(String[] args)
    {
        Functions fs = new Functions();
//        fs.printArraysRandom(); // Bài 1
//        fs.swapArrays(); // Bài 2
//        fs.sortPositiveNegativeNumbers(); // Bài 3
//        fs.averageArrays(); // Bài 4
//        fs.reverseSortedArrays(); // Bài 5
//        System.out.println(Arrays.toString(fs.removeDuplicates())); // Bài 6

    }

    public int[] printArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Nhập phần thử thứ " + i + ": ");
            array[i] = sc1.nextInt();
        }
        System.out.println("Hiển thị mảng:");
        for (int a : array) {
            System.out.print(a + " ");
        }
        return array;
    }

    // Bài 1
    public int[] printArraysRandom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
//            Scanner sc1 = new Scanner(System.in);
//            System.out.print("Nhập phần thử thứ " + i + ": ");
            Random rd = new Random();
            array[i] = rd.nextInt(n);
        }
        System.out.println("Hiển thị mảng:");
        for (int a : array) {
            System.out.print(a + " ");
        }
        return array;

    }

    //Bài 2
    public void swapArrays() {
        int[] array = printArrays();
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            if ((i + 1) == array.length) {
                break;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i++;
            }
        }
        System.out.println();
        System.out.println("Mảng sau khi đổi vị trí là:");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    // Bài 3
    public void sortPositiveNegativeNumbers()
    {
        int[] array = printArrays();
        int j = 0, temp;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                if (i != j)
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
        System.out.println("Mảng sau khi sắp xếp là:");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    //Bài 4
    public void averageArrays()
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average = 0;

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Nhập phần thử thứ " + i + ": ");
            array[i] = sc1.nextDouble();
        }

        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
            average = sum / array.length;
        }
        System.out.println("Trung bình của mảng Double là: " + average);
    }

    //Bài 5
    public void reverseSortedArrays()
    {
        int[] array = printArrays();
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) // 5 6 3 4 1
            {
                if (array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Mảng sau khi sắp xếp giảm dần là:");
        for (int a : array)
        {
            System.out.print(a + " ");
        }
    }

    // Bài 6
    public Integer[] removeDuplicates(Integer[] arr)
    {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(arr));
        return integerHashSet.toArray(new Integer[] {});
    }

    // Bài 7
    public String[] getAllTimeZoneByPrefixName()
    {
        List<String> list = new ArrayList<>();
        for (String timezone: TimeZone.getAvailableIDs()) {
            if (timezone.startsWith("America/"))
            {
                list.add(timezone.substring(8,timezone.length()));
            }
        }
        return list.toArray(new String[]{});
    }
}
