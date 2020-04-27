package ex4;

public class MilesToKilometer
{
    public static void main(String[] args)
    {
        UnitConversion unitConversion = value -> { return 1.6093 * value ; };
        System.out.println(unitConversion.conversion(10));
    }

}
