package day3;

public  class Conversions {
    private final double inches = 2.54;
    private final double gallon = 3.7854;
    private final double miles = 1.609344;

    public double convertInchesToCentimeters(double inputValue){
        return inches*inputValue;
    }
    public double convertGallonsToLiters(double inputValue){
        return gallon*inputValue;
    }
    public double convertMilesToKilometers(double inputValue){
        return miles*inputValue;
    }
}
