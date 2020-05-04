package com.smartosc.ex1_2;

public class Counter implements Runnable {
    Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
        new Thread(this, "CounterThread").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.storage.setValue(i);
        }
    }
}
