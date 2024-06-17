public abstract class Staff {
    private String Code;
    private String Phone;
    private String Name;
    private String Position;

    public Staff() {
        // Default constructor
    }

    public Staff(String Code, String Phone, String Name, String Position) {
        this.Code = Code;
        this.Phone = Phone;
        this.Name = Name;
        this.Position = Position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Code='" + Code + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                '}';
    }
}