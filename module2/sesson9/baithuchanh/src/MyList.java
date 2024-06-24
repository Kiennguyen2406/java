import java.util.Arrays;

public class MyList<E> {//Đây là lớp dùng để tạo và quản lý một danh sách các phần tử kiểu E.
    public int size=0;// Biến này sẽ lưu trữ số lượng phần tử hiện tại trong danh sách.
    public static final int DEFAULT_CAPACITY=10;// Hằng số này chỉ định sức chứa mặc định ban đầu của danh sách
    private Object elements[];//Mảng elements dùng để lưu trữ các phần tử của danh sách.
    // Do đó, mảng này có kiểu là Object[], có nghĩa là nó có thể chứa bất kỳ loại đối tượng nào.

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
        //Khởi tạo mảng elements với kích thước mặc định là DEFAULT_CAPACITY (trong trường hợp này là 10).
        //Lưu ý rằng, mặc dù mảng elements được khai báo là Object[],
        // nhưng vì Java không hỗ trợ mảng generic (mảng có kiểu dữ liệu là generic type E),
        // nên ở đây phải sử dụng Object[] và ép kiểu cần thiết khi thêm và truy xuất các phần tử.
        //Đây là một cách cơ bản để bắt đầu xây dựng một lớp danh sách đơn giản trong Java.


    }private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        elements[size]=e;
        size++;
    }
    public E get(int i) {
        return (E) elements[i];
    }
//    public class MyListTest {
//        public static void main(String[] args) {
//            MyList<Integer>listInteger=new MyList<Integer>();
//            listInteger.add(1);
//            listInteger.add(2);
//            listInteger.add(3);
//            listInteger.add(4);
//            listInteger.add(5);
//
//            System.out.println("element 4: "+listInteger.get(4));
//            System.out.println("element 1: "+listInteger.get(1));
//            System.out.println("element 2: "+listInteger.get(2));
//
//            listInteger.get(5);
//            System.out.println("element 6: "+listInteger.get(5));
//            //code here
        }

