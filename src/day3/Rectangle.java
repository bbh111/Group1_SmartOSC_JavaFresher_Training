package day3;

import java.util.HashMap;

public class Rectangle extends Shape {
    private Point pointA;
    private int width;
    private int height;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle() {
    }


    @Override
    public String centerPoint() {
        return (new Point(30,2).toString());
    }
}
