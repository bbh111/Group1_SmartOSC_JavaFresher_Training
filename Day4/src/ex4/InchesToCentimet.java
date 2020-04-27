package ex4;

public class InchesToCentimet
{
    public static void main(String[] args)
    {
        UnitConversion unitConversion = value -> { return 2.54 * value ; };
        System.out.println(unitConversion.conversion(10));

    }
}
