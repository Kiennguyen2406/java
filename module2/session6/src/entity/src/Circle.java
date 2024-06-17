public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, String filled, double radius) {
//        this.color = color;
//        this.filled = String.valueOf(filled);//Đó là vì dữ liệu private của lớp Geometric không thể
//        được truy xuất từ bất kỳ lớp nào ngoại trừ bản thân lớp Geometric,phải sử dụng set và get để lấy ra.
        setFilled(filled);
        setColor(color);
        this.radius = radius;
    }
    //Nếu ko có con tructornao mặc định có 1 contructor rỗng

    public Circle(){
        super("black", "no");
    }

    public Circle(double radius){
         //giá trị mặc định
        radius= this.radius;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){//diện tích hình tròn
        return radius*radius*2;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    public double getDiameter() {//Đường kính
        return 2*radius;
    }
    public void prinfCircle() {
        System.out.println("The"+getColor()+ " circle is created with the radius is "+radius);//In thông báo vẽ hình tròn bao gồm màu sắc và bán kính
    }
}
