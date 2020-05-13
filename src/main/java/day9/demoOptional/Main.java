package day9.demoOptional;

import java.util.Arrays;
import java.util.Optional;

public class Main {
//    public static void main(String[] args) {
//        Optional<Person> p1 = Optional.ofNullable(null);
//        Optional<Person> p2 = Optional.ofNullable(new Person());
//        Optional<Person> p3 = Optional.ofNullable(new Person(new Address()));
//        Optional<Person> p4 = Optional.ofNullable(new Person(new Address(new Province("Ha Noi"))));
//        getName(p1);
////        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };
////
////        Arrays.sort(stringArray, String::compareTo);
////        for (String str : stringArray) {
////            System.out.println(str);
////        }
//    }

    public static String getName(Optional<Person> p) {
        return  p.flatMap(person -> Optional.ofNullable(person.getAdd())
                .flatMap(adress -> Optional.ofNullable(adress.getProvince())
                        .flatMap(province -> Optional.ofNullable(province.getField1())))).orElseThrow(() -> new IllegalStateException("Loi"));
    }
}
