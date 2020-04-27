package ex3;

import java.io.File;
import java.util.Arrays;

public class SortedByPathName {
    public static void main(String[] args) {
        File dir = new File("./Fintech/Day4/src");
        File[] files = dir.listFiles();
        assert files != null;
        Arrays.sort(files , (s1, s2) ->
        {
            if(s1.isDirectory() && !s2.isDirectory())
            {
                return -1; // giảm dần
            }
                return 1;
        });

        for(File file : files)
        {
            if(file.isDirectory())
            {
                System.out.println(file.getName());
            }
            else {
                System.out.println(file.getName());
            }
        }
    }
}
