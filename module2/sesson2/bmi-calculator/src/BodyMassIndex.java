import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double weight,height,bmi;
        System.out.println("Your weight(in kilogam):");
        weight=scanner.nextDouble();
        System.out.println("Your height(in meter):");
        height=scanner.nextDouble();
        bmi=weight/(height*height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
