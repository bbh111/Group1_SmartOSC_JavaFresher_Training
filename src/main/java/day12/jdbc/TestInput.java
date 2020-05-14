package day12.jdbc;

import java.util.ArrayList;
import java.util.List;

public class TestInput {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Tai", 1));
        list.add(new Person(2, "Hieu", 2));
        list.add(new Person(3, "Nam", 1));
        list.add(new Person(4, "Hoang", 1));

        PersonDAO pdao = new PersonDAO();
        for (Person p : list
        ) {
            if (pdao.insertPerson(p) != 0) {
                System.out.println("Insert person " + p.getName() + " thanh cong");
            } else {
                System.out.println("Co loi xay ra");
            }
            ;
        }

        System.out.println("So nguoi den tu Ha Noi la: " + pdao.getPersonByCidID(1).size());
        System.out.println("So nguoi den tu HCM la: " + pdao.getPersonByCidID(2).size());
    }
}
