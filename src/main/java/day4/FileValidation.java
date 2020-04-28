package day4;


import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
public class FileValidation {

    private File[] rs;

    // Cau 1
    public File[] getFile(File dir) {
        return dir.listFiles((f) -> {
            return f.isDirectory();
        });
    }

    // Cau 2
    public File[] getValidFileExtension(File dir, String extensionName) {
        FilenameFilter filter = (f, extend) -> {
            return extend.endsWith(extensionName);
        };
        return dir.listFiles(filter);
    }
    // Cau 3

    public File[] sortFile(File[] inputFile) {
        Arrays.sort(inputFile, (file1, file2) -> {
            if (file1.isDirectory() && !file2.isDirectory()) {
                return -1;
            } else if (!file1.isDirectory() && file2.isDirectory()) {
                return 1;
            } else return file1.compareTo(file2);
        });
        return inputFile;
    }

    //Cau 4

    public void display(File[] input) {
        for (File f : input
        ) {
            System.out.println(f.getName());
        }
    }


}
