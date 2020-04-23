package com.company.day3.bai5;

public class LabeledPoint extends Point {
    private String content;

    public LabeledPoint() {
    }

    public LabeledPoint(String content, double x, double y) {
        super(x, y);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
