package org.example;

import bai1_2.Counter;
import bai1_2.Printer;
import bai1_2.Storage;

import java.util.concurrent.Semaphore;

public class Test
{
    public static void main(String[] args) {
        int n = 10;
        Storage storage = new Storage();
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits()+"asdadsada");
            new Counter(storage, n).start();
            semaphore.release();
            new Printer(storage, n).start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

