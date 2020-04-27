package ex2;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
    public static void main(String[] args) {
        File folder = new File("./Fintech/Day4/src/ex2");
        FilenameFilter filenameFilter = (dir, name) -> name.endsWith(".java");
        File[] files = folder.listFiles(filenameFilter);
        assert files != null;
        for(File file : files)
        {
            if(file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
}
