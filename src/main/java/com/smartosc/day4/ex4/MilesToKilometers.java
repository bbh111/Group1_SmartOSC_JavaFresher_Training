package com.smartosc.day4.ex4;

public class MilesToKilometers{
    public double conversion(double val) {
        IUnitConversion iUnitConversion = v -> v * 1.609344;
        return iUnitConversion.conversion(val);
    }
}
