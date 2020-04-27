package com.company.day4.bai4;

public class Bai4 {
    @FunctionalInterface
    interface InchesToCentimeters {
        double convert(double inch);
    }

    @FunctionalInterface
    interface GallonsToLiters {
        double convert(double gallon);
    }

    @FunctionalInterface
    interface MilesToKilometers {
        double convert(double mile);
    }

    public static void main(String[] args) {
        InchesToCentimeters inchesToCentimeters = ((inch) -> inch * 2.54);
        System.out.println(inchesToCentimeters.convert(5) + " centimeters");

        GallonsToLiters gallonsToLiters = (gallon) -> gallon * 3.785;
        System.out.println(gallonsToLiters.convert(6) + " liters");

        MilesToKilometers milesToKilometers = (mile) -> mile * 1.609;
        System.out.println(milesToKilometers.convert(5) + " kilometers");
    }
}
