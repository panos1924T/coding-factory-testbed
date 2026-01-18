package gr.aueb.cf.cf9.fromclass.unit3;

public class Point2D extends Point{

    private int y;

    public Point2D() {}

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public String toString() {
        return "Point x: " + getX() + " Point2D y: " + y;
    }
}
