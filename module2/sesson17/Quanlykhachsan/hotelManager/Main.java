package hotelManager;

import room.Room;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        while (true) {
            System.out.println("1,Them phòng");
            System.out.println("2,Sửa thông tin phòng");
            System.out.println("3,Xóa phòng");
            System.out.println("4,Hien thi ds các phòng");
            System.out.println("5,Lưu kết quả lên file");
            System.out.println("6,Lấy dữ liệu từ file xuống");
            System.out.println("7,Nhập dữ liệu mới trực tiếp lên file");

            System.out.println("8,ket thuc");
            Scanner scanner = new Scanner(System.in);

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("So phong");
                    int numberRoom = Integer.parseInt(scanner.nextLine());

                    System.out.println("Loại phòng");
                    String typeRoom = scanner.nextLine();
                    System.out.println("Giá phòng");
                    double priceRoom = Double.parseDouble(scanner.nextLine());
                    System.out.println("Tình trạng phòng");
                    String roomCondition = scanner.nextLine();

                    Room room1 = new Room(numberRoom, typeRoom, priceRoom, roomCondition);
                    hotelManager.addRoom(room1);
                    System.out.println("Phòng đã dc thêm vào");
                    break;
                case 2:
                    System.out.println("So phong can sua");
                    int numberRoomRepair = Integer.parseInt(scanner.nextLine());

                    System.out.println("Loại phòng cập nhật");
                    String typeRoomNew = scanner.nextLine();
                    System.out.println("Giá phòng cập nhật");
                    double priceRoomNew =  Double.parseDouble(scanner.nextLine());
                    System.out.println("Tình trạng phòng cập nhật");
                    String roomConditionNew = scanner.nextLine();
                    hotelManager.repairRoomByNumberRoom(numberRoomRepair,typeRoomNew,priceRoomNew,roomConditionNew);
                    System.out.println("thay đổi thành công ");
                    break;
                case 3:
                    System.out.println("Phòng cần xóa");
                    int numberRoomDelete = Integer.parseInt(scanner.nextLine());
                    hotelManager.deleteRoomByNumberRoom(numberRoomDelete);
                    System.out.println("xóa thành công");
                    break;
                case 4:
                    hotelManager.showList();
                    break;
                case 5:
                    hotelManager.saveFileText();
                    System.out.println("Đẩy dữ liệu lên file thành công");
                    break;

                case 6:
                    hotelManager.readFileText();
                    System.out.println("Đã lấy dữ liệu xuống,Vui lòng chọn mục 4 để xem kết quả");
                    break;
                case 7:
                    System.out.println("Số phòng");
                    int numberRoomFile = Integer.parseInt(scanner.nextLine());

                    System.out.println("Loại phòng");
                    String typeRoomFile = scanner.nextLine();
                    System.out.println("Giá phòng");
                    double priceRoomFile = Double.parseDouble(scanner.nextLine());
                    System.out.println("Tình trạng phòng");
                    String roomConditionFile = scanner.nextLine();

                    Room roomFile = new Room(numberRoomFile, typeRoomFile, priceRoomFile, roomConditionFile);
                    hotelManager.addRoom(roomFile);
                    hotelManager.saveFileText();
                    System.out.println("Phòng đã được thêm mới vào file");
                    break;
                case 8:
                    System.out.println("End");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ngoài lựa chọn");
                    break;
            }
        }
    }
}