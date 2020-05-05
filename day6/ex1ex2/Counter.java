package day6.ex1ex2;

public class Counter extends Thread
{
    Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
        new Thread(this, "").start();
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
