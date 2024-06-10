import java.util.Scanner;

public class Mang1Chieu {
    public static void main(String[] args) {

        int[]arr=new int[5];

        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<arr.length;i++) {
            System.out.print("nhập giá trị phần tử"+i);
            arr[i]= Integer.parseInt(scanner.nextLine());
            }
        System.out.println("các giá trị trong mảng");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        }

        }

