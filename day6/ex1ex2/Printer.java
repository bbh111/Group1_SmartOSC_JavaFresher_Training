package day6.ex1ex2;


public class Printer implements Runnable
{
    Storage storage;

    public Printer(Storage storage)
    {
        this.storage = storage;
        new Thread(this, "Thread").start();
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + this.storage.getValue());
        }
    }
}

