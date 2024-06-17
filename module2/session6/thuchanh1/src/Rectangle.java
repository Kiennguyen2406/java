public class Rectangle extends  shape{
    private double width=1.0;
    private double height=1.0;


    public Rectangle(){


    }

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return height*width;
    }
    public double  getPerimeter() {
        return (height+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", height=" + getWidth() +
                ", which is a subclass of"+super.toString()+
                '}';
    }
}
