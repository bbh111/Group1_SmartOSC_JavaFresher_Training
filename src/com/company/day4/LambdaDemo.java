package com.company.day4;

public class LambdaDemo {
    @FunctionalInterface
    interface Hello {
        String sayHello(final String name);
    }

    @FunctionalInterface
    interface Calc {
        int calc(int x, int y);
    }

    public static void main(String[] args) {
        Hello h = (name) -> "Hello " + name + "!";
        System.out.println(h.sayHello("Cường"));

        Calc c = (x, y) -> x * y;
        System.out.println(c.calc(4, 6));
    }
}
