import java.util.Arrays;
import java.util.Scanner;

public class themptu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhập các phần tử của mảng
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Nhập phần tử cần chèn
        System.out.print("Enter the element to insert: ");
        int X = scanner.nextInt();
        System.out.print("Enter the position to insert: ");
        int index = scanner.nextInt();
        System.out.print("Enter the element to insert: ");

        // Tạo mảng mới có kích thước lớn hơn mảng ban đầu một đơn vị
        int[] newArray = new int[size + 1];

        // Sao chép các phần tử từ mảng ban đầu sang mảng mới
        for (int i = 0; i < size; i++) {
            if (i == index ) {
                newArray[i] = X;
            } else if (i<index) {
                newArray[i] = array[i];
                
            }else {
                newArray[i+1] = array[i];//thêm vào phần tử cuối
            }
        }

         // Thêm phần tử mới vào cuối mảng

        // In ra mảng mới sau khi đã thêm phần tử
        System.out.println("Array after adding element " + X + ": " + Arrays.toString(newArray));
    }
}
