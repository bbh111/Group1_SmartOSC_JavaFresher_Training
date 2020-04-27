package bai3;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

public class Bai3 {

    public static void get(String path) {
        FileFilter fileFilter = pathname -> true;
        File[] files = new File(path).listFiles(fileFilter);
        Arrays.sort(Objects.requireNonNull(files), (File o1, File o2) -> {
            if (!o1.isDirectory() && o2.isDirectory()) return 1;
            return -1;
        });
        for (File file :
                Objects.requireNonNull(files)) {
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        String path = "src";
        get(path);
    }
}
