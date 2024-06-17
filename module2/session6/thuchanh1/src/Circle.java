public class Circle extends shape {
    private double radius;

    public Circle () {
        this.radius=1.0;
        setColor("red");
        setFilled(true);
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return radius*2*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "A Circle with radius=" + getRadius() +
                "which is a subclass of"+super.toString()+
                '}';
    }
}
