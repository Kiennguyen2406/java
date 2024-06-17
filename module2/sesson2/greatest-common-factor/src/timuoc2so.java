import java.util.Scanner;

public class timuoc2so {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Enter a: ");
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        b = scanner.nextInt();

        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
            scanner.close();
        }
    }
}
