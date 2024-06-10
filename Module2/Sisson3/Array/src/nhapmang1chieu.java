import java.util.Scanner;

public class nhapmang1chieu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[10];

        System.out.println("Enter a number: "+arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
