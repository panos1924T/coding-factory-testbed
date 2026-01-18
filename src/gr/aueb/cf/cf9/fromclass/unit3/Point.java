package gr.aueb.cf.cf9.fromclass.unit3;

public class Point {

    private int x;

    public Point() {}

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void movePlusOne() {
        x += 1;
    }

    @Override
    public String toString() {
        return "Point x coordinates: " + x;
    }
}
