package day5.ex4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Cat
{
    public static void cat(File file) throws IOException
    {
        String line;
        try (RandomAccessFile input = new RandomAccessFile(file, "r"))
        {
            while ((line = input.readLine()) != null)
            {
                System.out.println(line);
            }
        }
         catch (IOException ex)
         {
             System.err.println("I/O Error Exception: " + ex);
         }
    }

    public static void main(String[] args) {
        try {
            cat(new File("./src/main/java/day5/text.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
