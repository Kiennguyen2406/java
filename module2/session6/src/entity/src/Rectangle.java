public class Rectangle extends GeometricObject{//Hình chữ nhật

    private double width;
    private double height;
    public Rectangle() {
        super("red","yes");
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height,String color,String filled){
        this.width=width;
        this.height=height;
       setColor(color);
       setFilled(filled);
    }

    public  double getWidth() {
        return width;
    }

    public  double getHeight() {
        return height;
    }

    public double getdoubleArea() {
        return width*height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter() {
        return (width+height)*2;
    }
    public void prinfRec(){
       System.out.print("màu sắc"+getColor()+"chiều dài"+width+"Chiều rộng"+height);
    }
}
