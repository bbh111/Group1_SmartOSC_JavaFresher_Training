package com.smartosc.ex1_2;

public class Printer implements Runnable {
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
        new Thread(this, "PrinterThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("%s - %d", Thread.currentThread().getName(), this.storage.getValue()));
        }
    }
}
