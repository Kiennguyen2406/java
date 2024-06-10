import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a");
        int a = scanner.nextInt();

        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("Số này không phải là số nguyên tố");
                break;
            }else {
                System.out.println("Số này là số nguyên tố");
                break;
            }
        }
    }
}
