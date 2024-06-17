import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choice = -1;


        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3;i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 5; i >0; i--) {
                        for (int j = 0; j<=i; j++) {
                            System.out.print('*');
                        }
                        System.out.println();
                    }
                    break;
                case 4:

            }

        }
    }
}

