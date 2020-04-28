package com.company.day5.bai4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bai4 {
    private static void cat(File file) {
        String line;
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("./src/main/java/com/company/day5/bai4/cuong.txt");
        cat(file);
    }
}
