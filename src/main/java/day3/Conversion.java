package day3;
import java.util.Scanner;

public class Conversion extends UnitConvesion {
    private double incheToCentimeter = 2.54;
    private double gallonToLiter = 3.785411784;
    private double mileToKilometer = 1.609344;
    @Override
    public void inchesToCentimeters() {
        convertUnit("Enter your inches: ",incheToCentimeter,"Result of Inches to Centimeters : ");
    }

    @Override
    public void gallonsToLiters() {
        convertUnit("Enter your gallon: ",gallonToLiter,"Result of Gallons to Liters : ");
    }

    @Override
    public void milesToKilometers() {
        convertUnit("Enter your miles: ",mileToKilometer,"Result of Miles to Kilometers : ");
    }
    public void convertUnit(String text,double unit,String textResult){
        System.out.println(text);
        double value = Double.valueOf(new Scanner(System.in).nextLine());
        double result = value*unit;
        System.out.println(textResult+" "+result);
    }
}
