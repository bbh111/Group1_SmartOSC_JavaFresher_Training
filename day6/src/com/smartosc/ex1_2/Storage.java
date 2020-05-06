package com.smartosc.ex1_2;

public class Storage {
    private int value;

    public Storage(int value) {
        this.value = value;
    }

    // synchronized chỉ cho 1 thread truy cập đến, java ưu tiên thằng đến trước nếu đến sau thì phải chờ thread1 done.
    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
