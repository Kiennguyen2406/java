public class Cylinder extends Circle{
    public double height;
public  Cylinder (){

}
    public Cylinder(double radius,String color,double height){
      setRadius(radius);
      this.height=height;
      setColor(color);
    }

    public double getHeight() {
        return height;
    }
    public double volume() {
    return getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                "Radius"+getRadius()+"+"+
                "volume"+volume()+
                '}';
    }
}
