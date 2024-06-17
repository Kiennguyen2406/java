public class Shipper extends Staff{
        private String Range;

        public Shipper(String Code, String Phone, String Name, String Position,String Range) {
            super(Code, Phone, Name, Position);
            this.Range=Range;

        }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "Code='" + getCode() + '\'' +
                ", Phone='" + getPhone() + '\'' +
                ", Name='" + getPhone() + '\'' +
                ", Position='" + getPosition() + '\'' +
                "Range='" + this.Range + '\'' +
                '}';
    }
}




