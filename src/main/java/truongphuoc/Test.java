package truongphuoc;

public class Test
{
    public static void main(String[] args) {
        int n = 10;
        Storage storage = new Storage();
//        Semaphore semaphore = new Semaphore(1);
//        try {
//            semaphore.acquire();
//            System.out.println(semaphore.availablePermits()+"asdadsada");
        new Thread(new Printer(storage, n)).start();
            new Thread(new Counter(storage, n)).start();
//            semaphore.release();

//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}

