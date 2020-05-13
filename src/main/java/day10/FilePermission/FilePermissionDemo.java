package day10.FilePermission;

import java.io.File;
import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionDemo {


    public static void main(String[] args) {
        String file1 = "./src/main/java/day10/folder/text.txt";

        FilePermission permission = new FilePermission("./src/main/java/day10/folder/-", "read");
        PermissionCollection collections = permission.newPermissionCollection();
        collections.add(permission);

        // Set up path 2
        FilePermission permission1 = new FilePermission(file1,"write");
        collections.add(permission1);

        if(collections.implies(new FilePermission(file1,"read,write"))){
            System.out.println("Read, write permission is granted for the path "+ file1);
        }else{
            System.out.println("No permission");
        }
    }
}
