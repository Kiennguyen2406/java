import java.util.Scanner;

public class HienThi20SoNguyenDau {
    public static void main(String[] args) {

        // Bước 1: Khai báo biến và nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố cần in ra:");
        int number = scanner.nextInt();

        // Bước 3: Khai báo biến N và gán giá trị 2
        int N = 2;

        // Bước 4: Vòng lặp để tìm các số nguyên tố
        for (int i=0; i < number;i++)  {
            if (isPrime(N)) {
                System.out.print(N + " ");
            }
            N++;
        }
    }
        // Hàm kiểm tra số nguyên tố
        public static boolean isPrime(int n){
            if (n <= 1) {
                return false;
            }
                for (int i =2;i<=Math.sqrt(n);i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }return true;
            }
        }
