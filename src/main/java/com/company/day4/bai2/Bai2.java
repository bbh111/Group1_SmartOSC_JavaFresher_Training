package com.company.day4.bai2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        // Path to folder
        File file = new File("C:/Users/quocc/Downloads/Documents");
        // An array contains files name
        File[] paths;

        /*FilenameFilter filenameFilter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".pdf");
            }
        };*/

        FilenameFilter filenameFilter = (dir, name) -> name.endsWith(".pdf");

        paths = file.listFiles(filenameFilter);

        Arrays.stream(paths).forEach(System.out::println); // Method Reference

        for (File path : paths) {
            System.out.println(path.getName());
        }

    }
}
