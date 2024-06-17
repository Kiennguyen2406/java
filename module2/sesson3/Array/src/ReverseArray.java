import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        // Nhập độ dài của mảng (giới hạn tối đa là 20)
        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The array is too large.");
        } while (size > 20);

        // Nhập giá trị các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra các giá trị của mảng
        System.out.printf("%-20s%s", "Elements in array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println(); // Thêm dòng mới để cách biệt phần tử ban đầu và phần tử đảo ngược

        // Sử dụng biến trung gian để hoán đổi giữa 2 vị trí
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // In mảng đã đảo ngược ra màn hình
        System.out.printf("%-20s%s", "Reversed array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        scanner.close();
    }
}