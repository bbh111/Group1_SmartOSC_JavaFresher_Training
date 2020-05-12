package day9;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter implements Runnable {
//    private Thread t;
    private final Storage storage;
    private final int n;
    private Logger logger = LoggerFactory.getLogger(Printer.class);
    String threadName = "Counter Thread";

    public Counter(Storage storage, int n) {
        this.storage = storage;
        this.n = n;
    }

//    public void save(int i) {
//        try {
//            storage.setNumber(i);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public void start() {
//        if (t == null) {
//            t = new Thread(this, threadName);
//        }
//        t.start();
//    }

    @Override
    public void run() {
        for (int i = 1; i < this.n; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            storage.setNumber(i);
//            logger.info("current thread: " + threadName);
//            System.out.println(storage.getNumber());
        }
    }
}
