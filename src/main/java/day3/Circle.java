package day3;
public class Circle extends Shape {

    int Ox;
    int Oy;
    @Override
    void centerPoint() {

        System.out.println("CenterPoint of Circle");

    }

    public Circle(int ox, int oy) {
        Ox = ox;
        Oy = oy;
    }

    public Circle() {
    }
}
