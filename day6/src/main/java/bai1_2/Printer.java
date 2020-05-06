package bai1_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Printer implements Runnable {
    private final Storage storage;
    private Thread t;
    private final int n;
    String threadName = "Printer Thread";

    Logger logger = LoggerFactory.getLogger(Printer.class);

    public Printer(Storage storage, int n) {
        this.storage = storage;
        this.n = n;
//        start();
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
        }
        t.start();
    }

    @Override
    public void run() {
        while (true) {
//            System.out.println("Printer is running...");
//            System.out.println(storage.getNumber());
            logger.info("current value: ", storage.getNumber());
        }

    }
}
