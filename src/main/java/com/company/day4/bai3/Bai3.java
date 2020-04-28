package com.company.day4.bai3;

import java.io.File;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        // Path to folder
        File file = new File("C:\\Users\\quocc\\OneDrive\\Documents");
        // An array contains directories of folder
        File[] lists = file.listFiles();

        assert lists != null;
        Arrays.sort(lists, (f1, f2) -> {
            if (f1.isDirectory() && !f2.isDirectory())
                return -1;
            else if (!f1.isDirectory() && f2.isDirectory())
                return 1;
            else
                return f1.compareTo(f2);
        });

        for (File list : lists) {
            if (!list.isHidden()) {
                if (list.isDirectory())
                    System.out.println("dir: " + list.getName());
                else
                    System.out.println("file: " + list.getName());
            }
        }
    }
}
