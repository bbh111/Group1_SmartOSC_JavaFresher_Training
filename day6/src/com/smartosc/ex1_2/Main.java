package com.smartosc.ex1_2;

public class Main {
    public static void main(String[] args) {
        Storage store = new Storage();
        new Counter(store);
        new Printer(store);
    }
}
