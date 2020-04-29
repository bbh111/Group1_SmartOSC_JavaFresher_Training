package main.java.day5.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex4 {
    public static void cat(File file) {

        String line = null;
        try (RandomAccessFile input = new RandomAccessFile(file, "r");) {
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("..\\untitled\\src\\main\\java\\day5\\ex4\\temp1.txt");
        cat(file);
    }

}
