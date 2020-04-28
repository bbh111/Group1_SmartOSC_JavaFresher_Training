package com.smartosc.day2.controller;

import com.smartosc.utl.NumberUtil;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class ArrayController {
    public static final AtomicReference<ArrayController> instance = new AtomicReference<>();
    static Scanner scanner = new Scanner(System.in);
    public void generateViewConsole() {
        while (true) {
            System.out.println("1. Lấy dãy số ngẫu nhiên số tự nhiên từ 0 -> N.");
            System.out.println("2. Thay đổi vị trí số trước cho số sau trong dãy số");
            System.out.println("3. Di chuyển số dương lên trên đầu trong danh sách số tự nhiên.");
            System.out.println("4. Tính trung bình cộng của dãy số tự nhiên.");
            System.out.println("5. Sắp sếp lại dãy số theo chiều từ lớn đến bé.");
            System.out.println("6. Xóa phần từ trùng lặp trong dãy số.");
            System.out.println("7. Tìm kiếm danh sách Timezone bằng từ khóa. ");
            System.out.println("8. Quay lại");
            System.out.println("-------------------------*--------------------------\n");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng phần tử: ");
                    System.out.println(Arrays.toString(getRandomInts(scanner.nextInt())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println(Arrays.toString(this.swapsEle(enterValueToArrayInt())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println(Arrays.toString(this.swapsIndexNegative(enterValueToArrayInt())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Nhập số phần tử của mảng: ");
                    int sizeArr = scanner.nextInt();
                    double[] arrDoubles = new double[sizeArr];
                    for (int i = 0; i < arrDoubles.length; i++)
                    {
                        System.out.print("Nhập phần thử thứ " + i + ": ");
                        arrDoubles[i] = scanner.nextDouble();
                    }
                    System.out.println(this.calcAverage(arrDoubles));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println(Arrays.toString(this.sortDESC(enterValueToArrayInteger())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println(Arrays.toString(this.removeDuplicates(enterValueToArrayInteger())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Nhập từ khóa: ");
                    System.out.println(Arrays.toString(this.getAllTimeZoneByPrefixName(scanner.nextLine())));
                    System.out.println("Ấn enter để quay lại....");
                    scanner.nextLine();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại.");
                    break;
            }
        }
    }

    public int[] enterValueToArrayInt() {
        System.out.print("Nhập số phần tử của mảng: ");
        int sizeArr = scanner.nextInt();
        int[] arrInt = new int[sizeArr];
        for (int i = 0; i < arrInt.length; i++)
        {
            System.out.print("Nhập phần thử thứ " + i + ": ");
            arrInt[i] = scanner.nextInt();
        }
        return arrInt;
    }

    public Integer[] enterValueToArrayInteger() {
        System.out.print("Nhập số phần tử của mảng: ");
        int sizeArr = scanner.nextInt();
        Integer[] arrInteger = new Integer[sizeArr];
        for (int i = 0; i < arrInteger.length; i++)
        {
            System.out.print("Nhập phần thử thứ " + i + ": ");
            arrInteger[i] = scanner.nextInt();
        }
        return arrInteger;
    }

    // Ex 1
    public int[] getRandomInts(int elmNumber) {
        int[] ints = new int[elmNumber];
        for (int i = 0; i < elmNumber; i++) {
            ints[i] = NumberUtil.randomInt(elmNumber);
        }
        return ints;
    }

    // Ex 2
    public int[] swapsEle(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            if (i % 2 == 0 && (i + 1) < ints.length) {
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        return ints;
    }

    // Ex 3
    public int[] swapsIndexNegative(int[] ints) {
        int j = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                // nếu index == nhau thì bỏ qua.
                if (i != j) {
                    // Gán giá trị cho temp = giá trị của ints[i] vị trí thứ i nếu nó lớn 0
                    int temp = ints[i];
                    // Hoản đổi vị trí của số dương vừa tìm đc = ints[j], j ban đầu = 0 => lấy giá giá trị đầu tiên vào thay cho nó.
                    ints[i] = ints[j];
                    // Gán giá trị ints[j], j ban đầu = 0 => biến temp được lấy chính là số dương được gán vào vị trí đầu.
                    ints[j] = temp;
                }
                // Sau khi đoạn trên thực hiện phải cho j + 1 vì số dương đầu tiên đã tìm được ta phải next đến vị trí index tiếp theo.
                j++;
            }
        }
        return ints;
    }

    // Ex 4
    public double calcAverage(double[] doubles) {
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        return sum / doubles.length;
    }

    // Ex 5
    public Integer[] sortDESC(Integer[] ints) {
        Arrays.sort(ints, Collections.reverseOrder());
        return ints;
    }

    // Ex 6
    public Integer[] removeDuplicates(Integer[] arr) {
        HashSet<Integer> integerHashSet = new HashSet<>(Arrays.asList(arr));
        return integerHashSet.toArray(new Integer[]{});
    }

    // Ex 7
    public String[] getAllTimeZoneByPrefixName(String prefix) {
        List<String> list = new ArrayList<>();
        for (String timezone : TimeZone.getAvailableIDs()) {
            if (timezone.startsWith(prefix)) {
                timezone = timezone.replace(prefix, "");
                list.add(timezone);
            }
        }
        String[] results = list.toArray(new String[]{});
        Arrays.sort(results);
        return results;
    }


    public static ArrayController getController() {
        if (instance.get() == null) {
            instance.set(new ArrayController());
        }
        return instance.get();
    }
}
