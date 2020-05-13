package day7;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPI {
    static Supplier<Stream<String>> supplier = () -> Stream.of("Java", "abc", "123");

    static List<Integer> lst = new ArrayList<>();

    public static void Test() {
        System.out.println(supplier.get().count());
        supplier.get().sorted().forEach(System.out::print);
    }

    public static void main(String[] args) {
        // Test();
//        supplier.get().map(element->{
//            return element+="E";
//        }).forEach(System.out::println);

        List<List<Integer>> lst = new ArrayList<>();

//        lst.add(ls1);lst.stream().flatMap(Collection::stream).max(Comparator.comparing(Integer::valueOf)).get();
//        lst.add(Arrays.asList(5,6,7,8));
//        lst.stream().forEach(System.out::println);
//
//
//        lst.stream().flatMap(Collection::stream).forEach(System.out::println);
//        System.out.println("max: "+lst.stream().flatMap(Collection::stream).max(Comparator.comparing(Integer::valueOf)).get());
//        ls1.stream().mapToInt(v->v).max().getAsInt();
        List<Integer> ls1 = Arrays.asList(1, 2, 3, 4, 5, 5);
        ls1.stream().sorted((o1, o2) -> {
            return o1.intValue() - o2.intValue();
        }).forEach(System.out::println);


//        ls1.stream().sorted((myClass o1,myClass o2)->{
//            return o1.compareTo(o2.intNumber);
//        }).forEach(System.out::println);
        ls1.stream().distinct().forEach(System.out::println);
        test();
    }

    public static void test() {
        List<Integer> ls1 = Arrays.asList(1, 2, 3, 4, 5, 5);
        ls1.stream().sorted(new MyClass()::compareTo).forEach(System.out::println);
    }
}

class MyClass {
    public  <T extends Comparable> int compareTo(T another, T aother1) {
        return aother1.compareTo(another);
    }
}
