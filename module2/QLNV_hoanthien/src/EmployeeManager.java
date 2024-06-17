public class EmployeeManager implements WorkflowManagement {

    private Staff[] ListStaff;
    private int Size;
    private int limit;

    public EmployeeManager() {

    }

    public EmployeeManager(int limit) {
        this.ListStaff = new Staff[limit];
        this.limit = limit;
        this.Size = 0;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public Staff[] getListStaff() {
        return ListStaff;
    }

    public void setListStaff(Staff[] listStaff) {
        ListStaff = listStaff;
    }


    @Override
    public void AddStaff(Staff sf) {
        if (this.Size < this.limit) {
            ListStaff[Size] = sf;
            this.Size++;
        } else {
            System.out.println("Danh sách đã đầy.");
        }
    }

    @Override
    public void DisplaysALisTofEmployees() {
        for (int i = 0; i < this.Size; i++) {
            System.out.println(ListStaff[i]);
        }
    }

    @Override
    public void RepairStaff(String Code, String Phone, String Name, String Position) {
        for (int i = 0; i < this.Size; i++) {
            if (ListStaff[i].getCode().equals(Code)) {
                ListStaff[i].setPhone(Phone);
                ListStaff[i].setName(Name);
                ListStaff[i].setPosition(Position);
                System.out.println("Nhân viên đã được sửa đổi thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + Code);
    }
    public void RepairStaff(String Code, String Phone, String Name, String Position,String FactoryCode,String Type) {
        for (int i = 0; i < this.Size; i++) {
            if (ListStaff[i].getCode().equals(Code)) {
                ListStaff[i].setPhone(Phone);
                ListStaff[i].setName(Name);
                ListStaff[i].setPosition(Position);
                System.out.println("Nhân viên đã được sửa đổi thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + Code);
    }

    @Override
    public void DeleteStaff(String Code) {
        for (int i = 0; i < this.Size; i++) {
            if (ListStaff[i].getCode().equals(Code)) {
                for (int j = i; j < this.Size - 1; j++) {
                    ListStaff[j] = ListStaff[j + 1];
                }
                ListStaff[Size - 1] = null;
                this.Size--;
                System.out.println("Nhân viên có mã " + Code + " đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + Code);
    }
}