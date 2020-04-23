package com.smartosc.day3.entity.ex1_2;

public class GallonsToLiters extends UnitConversion {
    public GallonsToLiters() {
        super();
    }

    @Override
    public double conversion(double val) {
        return val * 4.5461;
    }
}
