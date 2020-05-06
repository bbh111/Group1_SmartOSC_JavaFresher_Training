package day7.Ex1;

public class Main {
    static int MIN_V = 0;
    static int MAX_V = 11;
    public static void main(String[] args) {
        Storage storage = new Storage();
        Printer printer = new Printer(storage);
        Counter counter = new Counter(storage);
    }
}
