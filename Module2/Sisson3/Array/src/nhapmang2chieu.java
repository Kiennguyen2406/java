import java.util.Scanner;

public class nhapmang2chieu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println("Enter"+"rows"+arr[0].length+"columns"+arr.length);
        for (int i=0;i<arr.length;i++) {
            System.out.println("phần tử row"+i);
            for (int j=0;j<arr.length;j++) {

                System.out.print("phần tử column"+j);
                arr[i][j]=scanner.nextInt();
            }
        }//in mảng
        System.out.println("Hiện mảng đã nhập");
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
