package day7.Ex1;

public class Counter extends Thread{
    public Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
        this.start();
    }

    @Override
    public void run() {
        for (int i = Main.MIN_V; i < Main.MAX_V; i++) {
            synchronized (storage) {
                try {
                    storage.setValue(i);//B2. setValue
                    storage.notifyAll(); //B3. thông báo và chuyển monitor về Printer.
                    storage.wait(); // B4. Đặt vào trạng thái Wait
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }

    }
}