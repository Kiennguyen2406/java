import java.util.Scanner;

class QuanLySinhVien {

    Scanner scanner=new Scanner(System.in);
    public SinhVien[] ListDS;
    public int limit;
    public int size;


    public QuanLySinhVien(int limit) {

        this.ListDS = new SinhVien[limit];
        this.size = 0;
        this.limit = limit;
        //Hàm khởi tạo này khởi tạo một đối tượng QuanLySinhVien với tham số limit:
        //ListDS được khởi tạo như một mảng mới của các đối tượng SinhVien với kích thước là limit.
        //size được đặt bằng 0, biểu thị rằng ban đầu không có sinh viên nào được thêm vào.
        //limit được gán bằng tham số limit truyền vào.

    }


    public void addSinhVien(SinhVien sv) {//list danh sachs
        if (size == limit) {
            System.out.println("Danh Sách đã đầy");

        } else {
            ListDS[size] = sv;
            this.size++;
            System.out.println("Sinh viên thêm vào DS");
        }
    }

    public void RepairSinhVien(int id,String name,int age){
        for (int i=0;i<size;i++){
        if (ListDS[i].getId()==id){
            ListDS[i].setAge(age);
            ListDS[i].setName(name);
            System.out.println("Sinh vien đã được caapj nhật");
            return;
        }
        }
        System.out.println("Không tìm thấy thẻ ID"+id);
    }
    //in ra cho mỗi lần in ra String
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(ListDS[i]);
        }

    }
}
