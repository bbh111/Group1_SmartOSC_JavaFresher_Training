package com.smartosc.ex1_2;

import java.util.concurrent.BlockingQueue;

public class Printer implements Runnable {
    private final BlockingQueue<Storage> queue;
    public Printer(BlockingQueue<Storage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
    private void process() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            System.out.println(queue.take().getValue());
        }
    }
}
