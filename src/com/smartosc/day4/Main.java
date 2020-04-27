package com.smartosc.day4;

import com.smartosc.day4.ex4.MilesToKilometers;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Main {
    static File folder = new File("./src/com/smartosc/day4").getAbsoluteFile();

    public static void main(String[] args) {
//        handlerEx1();
        handlerEx2();
//        handlerEx3();
//        handlerEx4();
    }

    // EX 1
    public static void handlerEx1() {
        FileFilter fileFilter = File::isDirectory;
        File[] files = folder.listFiles(fileFilter);
        if (null != files) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // EX 2
    public static void handlerEx2() {
        FilenameFilter txtFileFilter = (dir, name) -> name.endsWith(".txt");
        File[] files = folder.listFiles(txtFileFilter);
        if (null != files) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // 3
    public static void handlerEx3() {
        File[] files = folder.listFiles();
        if (null != files) {
            Arrays.sort(files, (f1, f2) -> {
                if (f1.isDirectory() && !f2.isDirectory()) {
                    return -1;
                } else if (!f1.isDirectory() && f2.isDirectory()) {
                    return 1;
                } else {
                    return f1.compareTo(f2);
                }
            });
            for (File file :
                    files) {
                if (!file.isHidden()) {
                    if (file.isDirectory()) {
                        System.out.println("DIR \t" + file.getName());
                    } else {
                        System.out.println("FILE\t" + file.getName());
                    }
                }
            }
        }
    }

    public static void handlerEx4() {
        MilesToKilometers milesToKilometers = new MilesToKilometers();
        System.out.println(milesToKilometers.conversion(10));
    }
}
