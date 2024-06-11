import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int [] arr1=new int[3];


        int [] arr2=new int[3];

        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter number "+(i+1)+":");
            arr1[i]=scanner.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println("Enter number "+(i+1)+":");
            arr2[i]=scanner.nextInt();
        }
        int [] newArr=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }for (int i=0;i<arr2.length;i++){
            newArr[arr1.length+i]= arr2[i];
        }
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }
}
