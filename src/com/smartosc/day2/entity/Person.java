package com.smartosc.day2.entity;

import java.util.Arrays;

public class Person {
    private String fullName;
    private String lastName;
    private String firstName;

    public Person() {
    }

    public Person(String fullName) {
        this.fullName = fullName;
        String[] strings = this.fullName.split("\\s+");
        if (strings.length != 1) {
            this.firstName = strings[0];
            this.lastName = strings[1];
        }
        System.out.println("Họ của bạn là" + this.lastName);
        System.out.println("Tên của bạn là" + this.firstName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName == null ? this.fullName : this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName == null ? this.fullName : this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
