package day12;

import day12.RAW_JDBC.Person;
import day12.RAW_JDBC.PersonDAO.PersonDAO;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person("Taink", 1);
        List<Person> list = new ArrayList<>();
        list.add(person);
        //System.out.println(personDAO.insertPerson(list));
        int count_HN = personDAO.getAllByCity(1).size();
        int count_TPHCM = personDAO.getAllByCity(2).size();
        System.out.println(count_HN + "  " + count_TPHCM);
    }
}