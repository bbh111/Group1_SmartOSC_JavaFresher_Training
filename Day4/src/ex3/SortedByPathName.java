package ex3;

import java.io.File;
import java.util.Arrays;

import static java.lang.System.*;

public class SortedByPathName {
    public static void main(String[] args) {
        File dir = new File("./Fintech/Day4/src");
        File[] files = dir.listFiles();
        assert files != null;

        Arrays.sort(files , (File s1, File s2) ->
        {
            if(s1.isDirectory() && !s2.isDirectory()) // 5 2 6 3 8
                return -1; // s1 đứng trc s2
            else if(s1.isDirectory() && s2.isDirectory())
            {
                return -1;
            }
            return 1;
        });

        for(File file : files)
        {
            out.println(file.getName());
        }
    }
}
