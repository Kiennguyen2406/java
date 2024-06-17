import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng");
        int limit = scanner.nextInt();
        scanner.nextLine(); // Tiêu thụ dòng mới

        employeeManager sl = new employeeManager(limit);

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

                    Staff staff1 = new OfficeStaff(Code, Phone, Name, Position);
                    sl.addStaff(staff1);
                    break;
                case 2:
                    sl.displaysAListToStaff();
                    break;
                case 3:
                    System.out.println("điền code");
                    String Code3 = scanner.nextLine();

                    if (sl.isEmployeeExist(Code3)) {

                        String[] employeeInfo = new String[4];
                        System.out.println("Mã");
                        employeeInfo[0] = scanner.nextLine();
                        System.out.println("Phone");
                        employeeInfo[1] = scanner.nextLine();
                        System.out.println("Tên");
                        employeeInfo[2] = scanner.nextLine();
                        System.out.println("Chức vụ");
                        employeeInfo[3] = scanner.nextLine();

                        sl.repairStaff(employeeInfo);
                        System.out.println("Da them thanh cong");

                    } else {
                        System.out.println("Khoong timf thay id");
                    }

                    // sua nv nao => hoi id
                    // id dung
                    // id sai => sai r. end

                    // id dung

                    break;

                //
                case 4:
                    System.out.println("điền code");
                    String Code4 = scanner.nextLine();

                    if (sl.deleteStaff(Code4)) {
                        System.out.println("Điền code");
                        String code4 = scanner.nextLine();
                        if (sl.isEmployeeExist(code4)) {
                            System.out.println("Mã");
                            String Code2 = scanner.nextLine();
                            sl.deleteStaff(Code2);
                        } else {
                            System.out.println("không tìm thấy công nhân cần xóa");
                        }
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