package com.company.day6.bai1_2;

public class Counter implements Runnable {

    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
        new Thread(this, "Counter Number").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.storage.setNumber(i);
        }
    }
}
