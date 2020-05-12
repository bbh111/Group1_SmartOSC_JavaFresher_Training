package day9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Printer implements Runnable {
    private final Storage storage;
//    private Thread t;
    private final int n;
    String threadName = "Printer Thread";
    private final static Logger logger = LoggerFactory.getLogger(Printer.class);

//    Logger logger = LoggerFactory.getLogger(Printer.class);

    public Printer(Storage storage, int n) {
        this.storage = storage;
        this.n = n;
//        start();
    }

//    public void start() {
//        if (t == null) {
//            t = new Thread(this, threadName);
//        }
//        t.start();
//    }

    @Override
    public void run() {
//        for (int i = 0; i < this.n; i++) {
        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            logger.info("Current value is {}", storage.getNumber());
        }
//        }

    }
}
