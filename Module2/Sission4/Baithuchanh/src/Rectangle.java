public class Rectangle {

    //B1:Khai báo thuộc tính
    double width;
    double height;

    public Rectangle() {
    }

    //B2:Khai báo phương thức khoiwr tạo thuoc tinh
    public Rectangle(double width, double height) {//tham số
        this.width = width;// Thuộc tínhd được gán cho mỗi tham số
        this.height = height;
    }

    //B3:Định nghĩa các phương thức getArea(),getPerimeter(),display()
    public double getArea() {//Diện tích hình chữ nhật
        return this.width * this.height;
    }

    public double getPerimeter() {//Chu vi hình chữ nhật
        return (this.width + this.height) * 2;
    }

    public String display() {//Hiển thị
        return "Rectangle{" + "width" + width + "height" + height + "}";

    }
}
