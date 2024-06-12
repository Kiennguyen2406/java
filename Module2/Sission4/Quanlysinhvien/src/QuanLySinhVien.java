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

    }


    public void addSinhVien(SinhVien sv) {//list danh sachs
        if (size == limit) {
            System.out.println("Khong hien thi DS");

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
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(ListDS[i]);
        }

    }
}
