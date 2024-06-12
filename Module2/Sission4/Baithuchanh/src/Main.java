import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //thực thi chương trình

//        Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width : ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height : ");
        double height = scanner.nextDouble();
        System.out.print("Hello and welcome!");

       Rectangle Rec= new Rectangle(width,height);
        System.out.println("Your Rectangle"+Rec.display());
        System.out.println("Perimeter of the Rectangle:"+Rec.getPerimeter());
        System.out.println("Perimeter of the Rectangle:"+Rec.getArea());

        }
    }
