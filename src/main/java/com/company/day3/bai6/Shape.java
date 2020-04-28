package com.company.day3.bai6;

abstract class Shape {
    private double x;
    private double y;

    Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    abstract void centerPoint();
}
