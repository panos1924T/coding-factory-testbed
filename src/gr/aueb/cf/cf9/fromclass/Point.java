package gr.aueb.cf.cf9.fromclass;

public class Point {

    private final int x;
    private final int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public static Point getInstance(int x, int y) {
        return new Point(x, y);
    }

    public static Point getRandomPoint() {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);

        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
