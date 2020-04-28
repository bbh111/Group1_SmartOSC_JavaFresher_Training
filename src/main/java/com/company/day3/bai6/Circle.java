package com.company.day3.bai6;

public class Circle extends Shape {
    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    void centerPoint() {
        System.out.println("{Circle: CenterPoint = (" + getX() + ", " + getY() + ")}");
    }
}
