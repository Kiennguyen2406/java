public class employeeManager implements WorkflowManagement {

    private Staff[] listStaff;
    private int size;
    private int limit;

    public employeeManager() {

    }

    public employeeManager(int limit) {
        this.listStaff = new Staff[limit];
        this.limit = limit;
        this.size = 0;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Staff[] getListStaff() {
        return listStaff;
    }

    public void setListStaff(Staff[] listStaff) {
        this.listStaff = listStaff;
    }

    @Override
    public void addStaff(Staff sf) {
        if (this.size < this.limit) {
            listStaff[size] = sf;
            this.size++;
        } else {
            System.out.println("Danh sách đã đầy.");
        }
    }
    @Override
    public void displaysAListToStaff() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(listStaff[i]);
        }
    }

    @Override
    public void repairStaff(String[] employeeInfo) {

        for (int i = 0; i < this.size; i++) {
            boolean repairTrue = listStaff[i].getCode().equals(employeeInfo[0]);
            if (repairTrue) {
                listStaff[i].setPhone(employeeInfo[1]);
                listStaff[i].setName(employeeInfo[2]);
                listStaff[i].setPosition(employeeInfo[3]);

            }
        }
    }
    @Override
    public void repairStaff(String Code, String Phone, String Name, String Position, String FactoryCode, String Type) {
        for (int i = 0; i < this.size; i++) {
            if (listStaff[i].getCode().equals(Code)) {
                listStaff[i].setPhone(Phone);
                listStaff[i].setName(Name);
                listStaff[i].setPosition(Position);
                System.out.println("Nhân viên đã được sửa đổi thành công.");

            }
        }
        System.out.println("Không tìm thấy nhân viên có mã " + Code);
    }

    @Override
    public boolean isEmployeeExist(String Code) {
        for (int i = 0; i < this.size; i++) {
            if (listStaff[i].getCode().equals(Code)) {
                return true;
            }
            }
        return false;
    }

    @Override
    public boolean deleteStaff(String Code) {

        for (int i = 0; i < this.size; i++) {
            boolean trueCode=listStaff[i].getCode().equals(Code);
            if (trueCode) {
                for (int j = i; j < this.size - 1; j++) {
                    listStaff[j] = listStaff[j + 1];
                }
                listStaff[size - 1] = null;
                this.size--;
                return true;
            }
        }
        return false;
    }

}