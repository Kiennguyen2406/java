public class App {//Kiểm thuwr

    public static void main(String[] args) {
        Circle circle = new Circle("red", "Yes", 2);
        System.out.println("A cirle"+circle);
        System.out.println("bán kính :"+circle.getRadius());
        System.out.println("Đường kính:"+circle.getDiameter());
        System.out.println("Chu vi"+circle.getDiameter());
        System.out.println("Dien tich"+circle.getArea());
        circle.prinfCircle();

        Rectangle rectangle=new Rectangle(4,4,"blue","yes");
        System.out.println("A Rectangle"+rectangle);
        System.out.println("Chiều dài"+rectangle.getWidth());
        System.out.println("Chiều rộng"+rectangle.getHeight());
        System.out.println("Chu vi"+rectangle.getWidth());
        System.out.println("Diện tích"+rectangle.getHeight());
        rectangle.prinfRec();

    }
}
