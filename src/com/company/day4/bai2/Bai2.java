package com.company.day4.bai2;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterLambda {
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

        for (File path : paths) {
            System.out.println(path.getName());
        }
    }
}
