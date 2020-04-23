package Ex5;

public class LabeledPoint extends Point
{
    String text;

    public LabeledPoint(int x, int y, String text)
    {
        super(x, y);
        this.text = text;
    }

    public void display()
    {
        System.out.println(x + " " + y + " " + text);
    }
}

