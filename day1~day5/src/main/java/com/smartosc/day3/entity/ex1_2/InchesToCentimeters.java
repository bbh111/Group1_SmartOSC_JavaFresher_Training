package com.smartosc.day3.entity.ex1_2;

public class InchesToCentimeters extends UnitConversion {
    public InchesToCentimeters() {
        super();
    }

    @Override
    public double conversion(double val) {
        return val * 2.54;
    }
}
