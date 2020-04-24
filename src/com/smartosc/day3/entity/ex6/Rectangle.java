package com.smartosc.day3.entity.ex6;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public void centerPoint() {
        System.out.println(String.format("(%s, %s)", width / 2, height / 2));
    }
}
