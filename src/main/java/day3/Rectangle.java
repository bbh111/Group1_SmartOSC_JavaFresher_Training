package day3;

public class Rectangle extends Shape {
    private Point pointA;
    private int width;
    private int height;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(Point pointA) {
        this.pointA = pointA;
    }

    @Override
    public String centerPoint() {
        return null;
    }

    public String centerPoint(boolean widthRight, boolean heightUp) {
        if(widthRight&&heightUp){
            return new Point((this.getPointA().getX()+this.width)/2,(this.getPointA().getY()+this.height)/2).toString();
        }else if(!widthRight&&heightUp){
            return new Point((this.getPointA().getX()-this.width)/2,(this.getPointA().getY()+this.height)/2).toString();
        }else if(widthRight&&!heightUp){
            return new Point((this.getPointA().getX()+this.width)/2,(this.getPointA().getY()-this.height)/2).toString();
        }else{
            return new Point((this.getPointA().getX()-this.width)/2,(this.getPointA().getY()-this.height)/2).toString();
        }
    }


}
