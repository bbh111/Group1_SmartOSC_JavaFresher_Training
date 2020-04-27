package day4;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;
public class FileValidation {

    private File[] rs;

    // Cau 1
    public File[] getFile(File dir) {
        return dir.listFiles((f) -> {
            return f.isDirectory();
        });
    }

    // Cau 2
    public File[] getValidFileExtension(File dir, String extensionName) {
        FilenameFilter filter = (f, extend) -> {
            return extend.endsWith(extensionName);
        };
        return dir.listFiles(filter);
    }
    // Cau 3

    public File[] sortFile(File[] inputFile) {
        Arrays.sort(inputFile, (file1, file2) -> {
            if (file1.isDirectory() && !file2.isDirectory()) {
                return -1;
            } else if (!file1.isDirectory() && file2.isDirectory()) {
                return 1;
            } else return file1.compareTo(file2);
        });
        return inputFile;
    }

    //Cau 4

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FileValidation fileValidation = new FileValidation();
        String choice = "-1";
        int choose = 0;
        do {
            do {
                doMain();
                try {
                    choice = scanner.nextLine();
                    choose = Integer.parseInt(choice);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Must be a number");
                }
            } while (true);
            switch (choose) {
                case 1:
                    System.out.println("Enter your directory");
                    String dir = scanner.nextLine();
                    if (fileValidation.getFile(new File(dir)) != null) {
                        fileValidation.display(fileValidation.getFile(new File(dir)));
                    } else {
                        System.out.println("Your directory not found");
                    }
                    break;
                case 2:
                    System.out.println("Enter your directory");
                    String dir2 = scanner.nextLine();
                    System.out.println("Enter filter extension part");
                    String extend = scanner.nextLine();
                    if (new File(dir2).listFiles() != null) {
                        File[] files = fileValidation.getValidFileExtension(new File(dir2), extend);
                        if (files.length!=0) {
                            System.out.println("All file with extension "+extend+ "is: ");
                            for (File f : files
                            ) {
                                System.out.println(f.getName());
                            }
                        } else {
                            System.out.println("Can not find extension file like that");
                        }
                    }else{
                        System.out.println("Your directory not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter your directory");
                    String dir3 = scanner.nextLine();
                    if (new File(dir3).listFiles() != null) {
                        System.out.println("All files before sort is: ");
                        fileValidation.display(new File(dir3).listFiles());
                        File[] files = fileValidation.sortFile(new File(dir3).listFiles());
                        System.out.println("All files after sort is");
                        fileValidation.display(files);
                    } else {
                        System.out.println("Your directory don't exist");
                    }
                    break;
                case 4:
                    System.out.println("Convert Inches to Centimeters: ");
                    double inches = scanner.nextDouble();
                    scanner.nextLine();
                    class Conversion {

                    }
                    break;
            }
        } while (Integer.parseInt(choice) != 5);
    }

    public void display(File[] input) {
        for (File f : input
        ) {
            System.out.println(f.getName());
        }
    }

    public static void doMain() {
        System.out.println("1.List all subfolder of Folder");
        System.out.println("2.Filter file by extendsion name");
        System.out.println("3.Sort file");
        System.out.println("4.Day 3 convert to lambda");
        System.out.println("5.Exit");
    }
}
