package com.smartosc.day2.entity;

public class Person {
    private String lastName;
    private String firstName;

    public Person(String fullName) {
        String[] strings = fullName.split("\\s+");
        if (strings.length != 1) {
            this.firstName = strings[0];
            this.lastName = strings[1];
        }
        System.out.println("Họ của bạn là" + this.lastName);
        System.out.println("Tên của bạn là" + this.firstName);
    }

}
