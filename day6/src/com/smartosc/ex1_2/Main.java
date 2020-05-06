package com.smartosc.ex1_2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Storage> q = new ArrayBlockingQueue<>(10);
        new Thread(new Printer(q), "ThreadPrinter").start();
        new Thread(new Counter(q), "ThreadCounter").start();
    }
}
