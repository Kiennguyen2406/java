import java.util.Scanner;

public class BaiDuPhong2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a");
        int a = scanner.nextInt();

        System.out.println("Nhập số b");
        int b = scanner.nextInt();

        for (; a != b; ) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất của a và b là " + a);
    }
}

