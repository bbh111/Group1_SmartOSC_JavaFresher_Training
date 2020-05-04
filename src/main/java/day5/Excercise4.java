package day5;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Excercise4 {
    public static void cat(File file) {
        String line = null;
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        cat(new File("./src/main/java/day5/test.txt"));
    }
}
