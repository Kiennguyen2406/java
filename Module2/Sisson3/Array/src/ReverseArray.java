import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;

        //in ra độ dài mảng tùy chọn
        do{
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The array is too large.");
        }while(size > 20);
        array = new int[size];
        int i=0;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i=0; i<array.length; i++) {
            int x = array[0];
            array[0]=array[array.length-1];
            array[array.length-1]=x;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
