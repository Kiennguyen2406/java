import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhâp a");
        double a=scanner.nextDouble();
        System.out.println("Nhâp b");
        double b=scanner.nextDouble();
        System.out.println("Nhâp c");
        double c=scanner.nextDouble();

        QuadraticEquation EQ = new QuadraticEquation(a,b,c);
        //tính delta
        double delta = EQ.getDiscriminant();
        if (delta > 0) {
           double root1= EQ.getRoot1();
           double root2= EQ.getRoot2();
           System.out.println("Phương trình có 2 nghiệm");
           System.out.println("Nghiệm thứ 1"+root1);
           System.out.println("Nghiệm thứ 2"+root2);
        }
    }




}