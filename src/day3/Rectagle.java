package day3;

public class Rectagle extends Shape {
    private int height;
    private int width;
    private int Ox;
    private int Oy;

    public Rectagle(int height, int width, int ox, int oy) {
        this.height = height;
        this.width = width;
        Ox = ox;
        Oy = oy;
    }

    public Rectagle() {

    }

    @Override
    void centerPoint() {
        System.out.println("CenterPoint of Rectagle: "+"("+(height/2 +this.Ox) + ","+(width/2+this.Oy) +")");
    }
}
