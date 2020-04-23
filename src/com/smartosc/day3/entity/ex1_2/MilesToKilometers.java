package com.smartosc.day3.entity.ex1_2;

public class MilesToKilometers extends UnitConversion {
    public MilesToKilometers() {
        super();
    }

    @Override
    public double conversion(double val) {
        return val * 1.609344;
    }
}
