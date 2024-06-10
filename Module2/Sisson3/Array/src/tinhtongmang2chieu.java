import java.util.Scanner;

public class tinhtongmang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int total =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){//nhỏ hơn độ dài của hàng 1
                total =total + matrix[i][j];
            }
        }System.out.println("total"+"="+total);

    }
}
