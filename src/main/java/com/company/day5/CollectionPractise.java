package com.company.day5;

import java.util.*;

public class CollectionPractise {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, ".net");
        map.put(3, "c++");

        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
