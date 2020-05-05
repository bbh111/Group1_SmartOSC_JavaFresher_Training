package com.company.day5.bai4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bai4 {
    static Logger logger = LoggerFactory.getLogger(Bai4.class);

    private static void cat(File file) {
        String line;
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.info("Example: ", Bai4.class.getSimpleName());
            e.printStackTrace();
            System.err.println(e.getMessage() + "tesssst");
        }
    }

    public static void main(String[] args) {
        File file = new File("./src/main/java/com/company/day5/bai4/cuon.txt");
        cat(file);
    }
}
