package com.smartosc.day3.entity.ex5;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(float x, float y, String label) {
        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
