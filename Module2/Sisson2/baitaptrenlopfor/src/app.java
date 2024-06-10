import java.util.Scanner;

public class app {
    public static void main(String[] args) {
//        /vieetst chuong trinh nhap tu ban phim 2 so a va b
//        Tinh tong cac so tu a->b

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a");
        int a = scanner.nextInt();

        System.out.println("Nhap b");
        int b= scanner.nextInt();

        if (a >= b) {
            System.out.println("a phải nhỏ hơn b");
        }

        int sum = 0;
        for (; a <= b ; a++) {
            sum = sum + a;
        }System.out.println("Tổng"+sum);
    }
}
