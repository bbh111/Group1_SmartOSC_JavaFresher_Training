package day6.ex1ex2;

public class Storage
{
    private int value;

    public synchronized int getValue()
    {
        return value;
    }

    public synchronized void setValue(int value)
    {
        this.value = value;
    }



}
