package day11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Valid {
    public static void main(String[] args) {
        String regex = "^(3[0-1]|((1|2|0)[0-9]))[/](0[1-9]|1[0-2])[/][0-9]{4}$";
        //Pattern pattern = Pattern.compile(regex);
        String text = "31/07/1999";
        text.matches(regex);
        //System.out.println();
        Valid valid = new Valid();
        // valid.readFile();
        // valid.readFile2("(<h1>)");
        valid.read();
    }

    //    public void readFile() {
//        File file = new File("temp.html");
//        int countH1 = 0;
//        int countH2 = 0;
//        String regex = "<h1>+";
//        String regex2 = "<h2>+";
//        Pattern pattern = Pattern.compile(regex);
//
//        try {
//            Reader reader = new FileReader(file);
//            BufferedReader reader1 = new BufferedReader(reader);
//            while (reader1.ready()) {
//                String temp = reader1.readLine();
//                String temp2[] = temp.split("</h1>");
//                Stream<String> x = Stream.of(temp2).filter(s -> s.matches(regex));
//                Stream<String> x2 = Stream.of(temp2).filter(s -> s.matches(regex2));
//                countH2+= x2.count();
//                countH1 += x.count();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("H1 : " + countH1 + " H2: " + countH2);
//    }
//    public int readFile2(String regex) {
//        File file = new File("temp.html");
//        int countH1 = 0;
//        int countH2 = 0;
//        try {
//            Reader reader = new FileReader(file);
//            BufferedReader reader1 = new BufferedReader(reader);
//            while (reader1.ready()) {
//                String temp = reader1.readLine();
//                Matcher matcher = Pattern.compile(regex).matcher(temp);
//                while (matcher.find()) {
//                    countH1++;
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("H2: " + countH1);
//        return countH1;
//    }
    //    public void read3(){
//        File file = new File("temp.html");
//        int countH1 = 0;
//        int countH2 = 0;
//        String regex = "<h1>";
//
//
//        try {
//            Reader reader = new FileReader(file);
//            BufferedReader reader1 = new BufferedReader(reader);
//           Stream<String> stream = Files.lines(Paths.get("temp.html"));
//            stream.forEach(s -> s);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public void read() {
        String regex = "<h1>";
        String regex2 = "<h2>";
        try {
            Predicate<String> predicate = s -> s.contains(regex);

            Stream<String> stream = Files.lines(Paths.get("temp.html"));

            Optional<Integer> optional = stream.filter(predicate).map(sx -> new H1lines(sx, regex).total()).reduce((integer, integer2) -> integer + integer2);
            System.out.println(optional.get());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

