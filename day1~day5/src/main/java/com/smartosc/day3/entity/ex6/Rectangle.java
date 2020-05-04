package com.smartosc.day3.entity.ex6;

public class Rectangle implements Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public void centerPoint() {
        System.out.printf("(%s, %s)%n", width / 2, height / 2);
    }
}
