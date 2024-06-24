import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1,Thêm sản pham");
            System.out.println("2,Sửa thông tin sản phẩm ");
            System.out.println("3,Xoá sản phẩm");
            System.out.println("4,Hiển thị danh sách sản phẩm");
            System.out.println("5,Tìm kiếm sản phẩm theo tên");
            System.out.println("6,Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.Exit");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Điền id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Điền tên");
                    String name = scanner.nextLine();
                    System.out.println("Điền số tiền ");
                    double price = scanner.nextInt();
                    productManager.addProduct(new Product(id, name, price));
                    System.out.println("Thông tin đã được thêm vào");
                    break;
                case 2:
                    System.out.println("Điền id cần sửa");
                    int idLocal = scanner.nextInt();

                    System.out.println("Điền id mới");
                    int idNew = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Điền tên mới ");
                    String nameNew = scanner.nextLine();
                    System.out.println("Điền giá tiền mới");
                    double priceNew = scanner.nextInt();
                    productManager.repairByID(idLocal,new Product(idNew,nameNew,priceNew));
                    System.out.println("Thông tin đã được chỉnh sửa");
                    break;
                case 3:
                    System.out.println("Điền id cần xóa");
                    int remoteId = scanner.nextInt();
                    productManager.deleteByID(remoteId);
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    System.out.println("Điền tên cần tìm kiếm");
                    String findName = scanner.nextLine();

                    productManager.SearchByName(findName);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có trong mục cần chọn");
            }
        }
    }
}