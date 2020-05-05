package day6.ex1ex2;

public class Main
{
    public static void main(String[] args)
    {
        Storage store = new Storage();
        new Counter(store);
        new Printer(store);
    }
}
