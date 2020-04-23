package com.company.day3.bai5;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        LabeledPoint lp = new LabeledPoint("Red Wine", 71, 117);

        System.out.println("LabeledPoint = {content:" + lp.getContent() + ", x: " + lp.getX() + ", y: " + lp.getY() + "}");
    }
}
