import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng SV: ");
        int SL = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        QuanLySinhVien sl = new QuanLySinhVien(SL);

        while (true) {
            System.out.println("1. Thêm SV");
            System.out.println("2. Sửa SV");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline

            switch (choice) {
                case 1:
                    System.out.println("Nhập thẻ ID tương ứng: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the remaining newline
                    System.out.println("Nhập tên SV: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the remaining newline
                    SinhVien sv = new SinhVien(id, name, age);
                    sl.addSinhVien(sv);//Gọi phương thức đo ra
                    break;
                case 2:
                    System.out.println("Nhập thẻ ID tương ứng: ");
                    int idNew = scanner.nextInt();
                    scanner.nextLine(); // Consume the remaining newline
                    System.out.println("Nhập tên SV: ");
                    String nameNew = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int ageNew = scanner.nextInt();
                    scanner.nextLine(); // Consume the remaining newline
                    sl.RepairSinhVien(idNew, nameNew, ageNew);
                    break;
                case 3:
                    sl.display();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}