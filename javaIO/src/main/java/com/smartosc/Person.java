package com.smartosc;

import java.util.Optional;

public class Person {
    private final Address address;

    public Person(Address address) {
        this.address = address;
    }

    public static String getProvince(Person person) {
        return Optional.ofNullable(person)
                .flatMap(p1 -> Optional.ofNullable(p1.getAddress()))
                .flatMap(address -> Optional.ofNullable(address.getProvince()))
                .orElseThrow(() -> new ProvinceNotFound("Province is not found")).getName();
    }

    public Address getAddress() {
        return address;
    }
}
