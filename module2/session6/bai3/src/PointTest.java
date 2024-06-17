public class PointTest {


    public static void main(String[] args) {

        Point point = new Point(2, 3);

        System.out.println(point);

        MoveablePoint moveablePoint=new MoveablePoint(1.0f,2.0f,0.5f,0.5f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
