public class FactoryStaff extends Staff {

    private String FactoryCode;
    private String Type;

    public FactoryStaff(String Code,String Phone,String Name,String Position,String FactoryCode,String Type){
        super(Code,Phone,Name,Position);
        this.FactoryCode=FactoryCode;
        this.Type=Type;
    }

    public String getFactoryCode() {
        return FactoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        FactoryCode = factoryCode;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "Code='" + getCode() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Name='" + getPhone() + '\'' +
                ", Position='" + getPosition() + '\'' +
                ",FactoryCode=" + getFactoryCode() + '\'' +
                "Type" + getType() +
                '}';

    }
    }

