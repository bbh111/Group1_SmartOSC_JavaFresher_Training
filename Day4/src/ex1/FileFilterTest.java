package ex1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class FileFilterTest {
    public static void main(String[] args) {
        File dir = new File("./Fintech/Day4/src");
        FileFilter fileFilter = pathname -> pathname.length() < 1000;
        File[] files = dir.listFiles(fileFilter);
        assert files != null;
/*
        for(File file : files)
        {
            if(file.isDirectory())
            {
                System.out.println(file.getName());
            }
        }
*/
        Arrays.stream(files).forEach(System.out::println);
    }
}
