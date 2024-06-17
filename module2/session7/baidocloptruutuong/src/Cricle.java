public class Cricle extends  GeometricObject{
    private double radius;

    public Cricle(){

    }
    public Cricle(double radius) {
        this.radius=radius;
    }
    public Cricle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}
