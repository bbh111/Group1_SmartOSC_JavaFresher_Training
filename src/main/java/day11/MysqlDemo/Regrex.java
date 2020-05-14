package day11.MysqlDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
public class Regrex {
    static String regex = "^[0-2][0-9]|(3)[0-1][/-:](((0)[0-9])|((1)[0-2]))[/-:][0-9]{4}$";

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(regex);
//        String test ="29/12/1999";
//        Matcher matcher = pattern.matcher(test);
//        if(matcher.find()){
//            System.out.println("OK");
//        }else{
//            System.out.println("Not OK");
//        }

        File fileHtml = new File("testhtml.html");
        //readHtml(new File("../test.html"));
    }

    public static int readHtml(File f){
        try {
            Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(f)));
            List<String> list = new ArrayList<>();
            while(sc.hasNext()){
                list.add(sc.nextLine());
            }
            Pattern pattern = Pattern.compile("<h[1-2]>");
            list.stream().forEach(System.out::println);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
