package com.smartosc.ex1_2;

import java.util.concurrent.BlockingQueue;

public class Counter implements Runnable {
    private final BlockingQueue<Storage> queue;
    public Counter(BlockingQueue<Storage> blockingQueue) {
        this.queue= blockingQueue;
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void process() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            queue.put(new Storage(i));
        }
    }
}
