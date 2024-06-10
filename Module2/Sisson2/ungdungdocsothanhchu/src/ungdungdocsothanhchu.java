import java.util.Scanner;

public class ungdungdocsothanhchu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int so;
        System.out.println("So can doc");
            so = scanner.nextInt();
            switch (so) {
                case 1:
                    System.out.println("mot");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 5:
                    System.out.println("nam");
                    break;
                case 6:
                    System.out.println("sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
                case 0:
                    System.out.println("khong");
                    break;
                default:
                    System.out.println("So khong hop le");
                    break;
            }
        }
    }

