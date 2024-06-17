import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);
        float[] kq= point2D.getXY();
        System.out.println(Arrays.toString(kq));
        System.out.println(point2D.getXY()[1]);




    }
}
