package com.company.day6.bai1_2;

public class Bai1 {
    public static void main(String[] args) {

        Storage storage = new Storage();
        new Counter(storage);
        new Printer(storage);
    }
}
