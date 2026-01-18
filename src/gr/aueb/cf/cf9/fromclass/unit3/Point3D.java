package gr.aueb.cf.cf9.fromclass.unit3;

public class Point3D extends Point2D{

    private int z;

    public Point3D() {}

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public String toString() {
        return "Point x: " + getX() + " Point2D y: " + getY() + " Point3D z: " + z;
    }
}
