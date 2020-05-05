package com.company.day6.bai1_2;

public class Printer implements Runnable {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
        new Thread(this, "Printer Number").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " - " +this.storage.getNumber());
        }
    }
}
