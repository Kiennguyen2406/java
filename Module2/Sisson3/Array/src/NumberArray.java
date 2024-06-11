import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        // Nhập độ dài của mảng (giới hạn tối đa là 20)
        do {
            System.out.println("Enter the size of the array (<= 20):");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size of the array is too large.");
            }
        } while (size > 20);

        // Khởi tạo mảng với kích thước đã nhập
        array = new int[size];

        // Nhập giá trị các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tìm phần tử lớn nhất trong mảng
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        // In ra phần tử lớn nhất và vị trí của nó
        System.out.println("The largest element is " + max + " at position " + index);

        scanner.close();
    }
}