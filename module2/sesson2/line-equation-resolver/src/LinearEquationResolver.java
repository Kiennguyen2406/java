import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b =c',please enter constants");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a : ");
        double a = scanner.nextDouble();///khai báo kiểu so thuc
        //scanner.nextDouble():Phương thức khai báo kiểu dữ liệu chuẩn nhập từ bàn phím vào

        System.out.print("b : ");
        double b = scanner.nextDouble();

        System.out.print("c : ");
        double c = scanner.nextDouble();
        //b4:Tìm nghiệm của pt
        if (a!=0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n5", answer);
            System.out.printf("Equation pass with x = %f!", answer);// Dòng mới sẽ được tạo \n,dùng pr
        }else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("Equation has no solution!");
            }
        }

        }
    }

