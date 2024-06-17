import java.util.Scanner;

public class ucln {
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        System.out.println("Nhâập số b");
        int b = scanner.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if (a==0 || b==0) {
            System.out.println("không có ước chung");
        }
        while (a!=b) {
            if (a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
        }System.out.println("Great common factors"+a);
        //Ước chung lớn nhất của a và b
    }
}
