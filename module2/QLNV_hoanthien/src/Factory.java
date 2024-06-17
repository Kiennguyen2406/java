import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng");
        int limit = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ dòng mới

        EmployeeManager sl = new EmployeeManager(limit);

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Kết thúc");

            System.out.println("Chọn");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Tiêu thụ dòng mới

            switch (choice) {
                case 1:
                    System.out.println("Mã");
                    String Code = scanner.nextLine();
                    System.out.println("Phone");
                    String Phone = scanner.nextLine();
                    System.out.println("Tên");
                    String Name = scanner.nextLine();
                    System.out.println("Chức vụ");
                    String Position = scanner.nextLine();
                    System.out.println("Mã xưởng");
                    String FactoryCode = scanner.nextLine();
                    System.out.println("Kiểu");
                    String Type = scanner.nextLine();

                    Staff staff1 = new FactoryStaff(Code, Phone, Name, Position,FactoryCode,Type);
                    sl.AddStaff(staff1);
                    break;
                case 2:
                    sl.DisplaysALisTofEmployees();
                    break;
                case 3:
                    System.out.println("Mã");
                    String Code1 = scanner.nextLine();
                    System.out.println("Phone");
                    String Phone1 = scanner.nextLine();
                    System.out.println("Tên");
                    String Name1 = scanner.nextLine();
                    System.out.println("Chức vụ");
                    String Position1 = scanner.nextLine();
                    System.out.println("Mã xưởng");
                    FactoryCode = scanner.nextLine();
                    System.out.println("Kiểu");
                    Type = scanner.nextLine();

                    sl.RepairStaff(Code1, Phone1, Name1, Position1,FactoryCode,Type);
                    break;
                case 4:
                    System.out.println("Mã");
                    String Code2 = scanner.nextLine();
                    sl.DeleteStaff(Code2);
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}

