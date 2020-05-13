package com.smartosc;

public class Address {
    private final Province province;

    public Address(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }
}
