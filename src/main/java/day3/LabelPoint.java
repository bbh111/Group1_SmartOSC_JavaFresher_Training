package main.java.day3;
public class LabelPoint extends Point {
    private String name;

    public LabelPoint(String name,double x, double y) {
        super(x, y);
        this.name = name;
    }
    public void display(){
        System.out.println("name = "+ name);
    }
}
