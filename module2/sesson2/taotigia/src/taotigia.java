import java.util.Scanner;

public class taotigia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double USD;
        double VND;

        System.out.println("Enter USD");
        USD = scanner.nextDouble();

        VND = USD/23000;

        System.out.println(VND);
    }

}
