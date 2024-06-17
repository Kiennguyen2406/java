

public class Point3D extends Point2D{
    public float z=0.0f;
    public  Point3D () {

    }
    public Point3D(float x,float y,float z) {
    this.z=z;
    setX(x);
    setY(x);

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public float[] getXYZ() {
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x="+getX()+
                "y"+getY()+
                "z=" + z +
                '}';
    }
}
