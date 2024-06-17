import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner=new Scanner(System.in); //Khai báo đối tuượng nhập từ bàn phím

        System.out.println("Enter width");
        width = scanner.nextFloat(); //Nhâập chiều rong

        System.out.println("Enter height");
        height = scanner.nextFloat(); //nhập chiều dài

        float area = width * height;
        System.out.println("Area = " + area);
    }
}
