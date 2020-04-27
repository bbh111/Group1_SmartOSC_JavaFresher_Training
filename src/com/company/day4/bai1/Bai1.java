package com.company.day4.bai1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Bai1 {

    public static void main(String[] args) {
        // Path to folder
        File file = new File("C:/Users/quocc/Downloads");
        // An array contains directories of folder
        File[] paths;

        /*FileFilter fileFilter = directory -> directory.isDirectory();*/
        FileFilter fileFilter = File::isDirectory;

        paths = file.listFiles(fileFilter);
        assert paths != null;

        Arrays.stream(paths).forEach(System.out::println); // Method Reference

        /*for (File path : paths) {
            System.out.println(path);
        }*/

    }
}
