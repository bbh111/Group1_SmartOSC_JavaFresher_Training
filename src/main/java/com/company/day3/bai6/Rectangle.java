package com.company.day3.bai6;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    void centerPoint() {
        System.out.println("{Rectangle: CenterPoint = (" + getX() + ", " + getY() + ")}");
    }
}
