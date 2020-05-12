package day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
//        String[] arr = {"ab", "cdc", "mn", "az", "abcd", "zyx"};
//        Stream<String> stream = Stream.of(arr);
//        int x = 0;
//        System.out.println(stream.collect(Collectors.groupingBy(String::length, Collectors.counting())).keySet().stream().mapToInt(e -> 1).reduce((left, right) -> left + right));
//         //  AtomicInteger atomicInteger = new AtomicInteger(1);

//            byte[] b = {'h','e','l','l','o'};
//        try {
//            OutputStream stream = new FileOutputStream(new File("Text.txt"));
//            stream.write(b,0,5);
//            stream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            int i = 0;
//            InputStream inputStream = new FileInputStream(new File("Text.txt"));
//            while (((i =inputStream.read())) != -1){
//                System.out.println((char) i);
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /*
         *  Luồng character
         * */
        long time_start = System.currentTimeMillis();
//        try {
//            Reader reader = new FileReader("Text.txt");
//            char[] temp = new char[10];
//            int i = 0;
//            String s = null;
//            while ((i = reader.read(temp)) != -1) {
//                s += new String(temp);
//                System.out.println(i);
//            }
//            System.out.println(s);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /*
         * Writer
         * */
//        try {
//
//            Writer writer = new FileWriter(new File("Text.txt"));
//            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("Text.txt"));
//            String s = "Nguyễn Khanh Tai 31/07/1999　私は:　たいです。";
//            //writer.write(s);
//            stream.writeObject(s);
//          //  writer.close();
//            stream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Supplier<Stream<Double>> supplier = () -> Stream.of(11.1, 5.3, 6.4, 7.2, 8.9);
//        Optional<Double> x  =supplier.get().collect(Collectors.reducing((aDouble, aDouble2) ->
//        {
//            atomicInteger.incrementAndGet();
//            return aDouble + aDouble2;
//        }));


        //   System.out.println("Using AtomicInteger: "+ x.get()/atomicInteger.get());
        //    System.out.println("Using AveragingDouble: "+supplier.get().collect(Collectors.averagingDouble(Double::doubleValue)));
//        try {
//            RandomAccessFile accessFile = new RandomAccessFile("Text.txt","rw");
//            String x = "ASDFVCCB ASDDFDSG xzcnm,asfkjn";
//
//            accessFile.writeUTF(x);
//          //  accessFile.seek(5);
//        //    accessFile.writeUTF("Taink2");
//
//            System.out.println(accessFile.readUTF());
//            accessFile.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //Using Buffer
        //read
//        List<String> list = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader("Text.txt");
//            BufferedReader reader = new BufferedReader(fileReader);
//            while (reader.ready()) {
//                //System.out.println(reader.readLine());
//                list.add(reader.readLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        list.add("XXX");
//        //write
//        try {
//            FileWriter writer = new FileWriter("Text.txt");
//            BufferedWriter writer1 = new BufferedWriter(writer);
//            list.forEach(s -> {
//                try {
//                    writer1.write(s);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        try {
            byte[] bytes = Files.readAllBytes(Paths.get("Text.txt"));

            String str = new String(bytes,"UTF-16");
            Files.copy(Paths.get("XXXText.txt"),Paths.get("FFF.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        long time_end = System.currentTimeMillis();
        Matcher
        System.out.println("time is: "+(time_end - time_start));
    }
}
