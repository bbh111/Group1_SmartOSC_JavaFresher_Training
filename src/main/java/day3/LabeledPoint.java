package day3;

public class LabeledPoint extends Point{
    private String labelValue ;

    public LabeledPoint(double x, double y, String labelValue) {
        super(x, y);
        this.labelValue = labelValue;
    }
    public void Display(){
        System.out.println(this.labelValue+" "+ super.getX()+" "+super.getY());
    }
}
