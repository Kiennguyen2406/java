public class OfficeStaff extends Staff {


    public OfficeStaff(String Code, String Phone, String Name, String Position) {
        super(Code, Phone, Name, Position);

    }

    @Override
    public String toString() {
        return "Staff{" +
                "Code='" + getCode() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Name='" + getPhone() + '\'' +
                ", Position='" + getPosition() + '\'' +
                '}';


    }
}

