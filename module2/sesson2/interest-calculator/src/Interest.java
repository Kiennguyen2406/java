import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào số tiền gửi") ;
        double a = scanner.nextDouble();
        System.out.println("nhập vào lãi suất của tháng") ;
        double b= scanner.nextDouble();
        System.out.println("nhập vào thời gian") ;
        double c = scanner.nextDouble();

        double totalInterest = 0;
        for (int i=0; i<c;i++) {
            totalInterest+= a * (b/100)/12 * c;

        }System.out.println("total interest"+totalInterest);

    }
}
