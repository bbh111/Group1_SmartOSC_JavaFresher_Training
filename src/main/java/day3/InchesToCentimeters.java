package day3;

public class InchesToCentimeters extends UnitConversions {
    private double inches = 2.54;
    public double execute() {
        return this.inches * super.getInput();
    }
}
