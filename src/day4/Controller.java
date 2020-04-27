package day4;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
    final String PATH_NAME = "D:";

    public void bai1() {
        File dir = new File(PATH_NAME);
        if (dir.isDirectory()) {
            File[] subDir = dir.listFiles(fileTemp -> fileTemp.isDirectory());
            for (File file : subDir) {
                System.out.println(file.getName());
            }
        }
    }

    public void bai2(String name2) {
        File dir = new File(PATH_NAME);

        if (dir.isDirectory()) {
            String[] subDir = dir.list((dir1, name) -> {
                return name.endsWith(name2);
            });

            display(subDir);
        }
    }

    public void display(String[] strings) {
        for (String temp : strings) {
            System.out.println(temp);
        }
    }

    public void bai3() {
        File dir = new File(PATH_NAME);
        if (dir.isDirectory()) {
            File[] files = dir.listFiles(file -> file.exists());
            Arrays.sort(files, (o1, o2) -> {
                if (o1.isDirectory()) {
                    if (o2.isDirectory()) {
                        return o1.compareTo(o2);
                    }
                    return -1;
                } else {
                    if (o2.isDirectory()) {
                        return 1;
                    }
                    return 0;
                }
            });
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    public void bai4() {
        File dir = new File("..\\untitled\\src\\day3");
        String[] files = dir.list();
        display(files);
    }
}
