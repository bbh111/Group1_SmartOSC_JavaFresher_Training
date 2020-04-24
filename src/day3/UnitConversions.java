package day3;

public abstract class UnitConversions {
    private double input;

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }
    public abstract double execute();
}

class InchesToCentimeters extends UnitConversions {
    private double inches = 2.54;
    public double execute() {
        return this.inches * super.getInput();
    }
}

class GallonsToLiters extends UnitConversions {
    private double gallon = 3.7854;
    public double execute() {
        return this.gallon * super.getInput();
    }
}

class MilesToKilometers extends UnitConversions {
    private double miles = 1.609344;
    public double execute() {
        return this.miles * super.getInput();
    }
}
