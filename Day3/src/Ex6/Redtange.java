package Ex6;

public class Redtange extends Shape
{
    private double x;
    private double y;

    public Redtange(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void centerPoint() {
        System.out.println("(" + x/2 + "," + y/2 + ")");
    }
}
