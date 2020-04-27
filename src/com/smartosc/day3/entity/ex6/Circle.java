package com.smartosc.day3.entity.ex6;

public class Circle extends Shape {
    private String centerPoint;
    public Circle(float x, float y) {
        super();
        this.centerPoint = String.format("(%s, %s)", x, y);
    }
    @Override
    public void centerPoint() {
        System.out.println(this.centerPoint);
    }
}
