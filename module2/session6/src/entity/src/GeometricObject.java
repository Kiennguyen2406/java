import java.util.Date;

public class GeometricObject {
    protected String color="white";
    protected String filled=null;

    public GeometricObject(String color, String filled) {
        this.color = color;
        this.filled = filled;

    }
// cách khảo tạo lớp con
    public GeometricObject() {
    }


    public String getColor() {
        return color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Từng hình{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

