
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Pair với kiểu dữ liệu là Integer
        Pair<Integer> intPair = new Pair<>(4, 5);// first,Second,kiểu ữ liệu bên trong tham số(Đối số)

        // In ra các giá trị của cặp Integer
        intPair.printPair(); // Output: (1, 2)

        // Thay đổi giá trị và in lại
        intPair.setFirst(3);
        intPair.setSecond(4);
        intPair.printPair(); // Output: (3, 4)

        // Tạo một đối tượng Pair với kiểu dữ liệu là String
        Pair<String> strPair = new Pair<>("Hello", "World");

        // In ra các giá trị của cặp String
        strPair.printPair(); // Output: (Hello, World)

        // Thay đổi giá trị và in lại
        strPair.setSecond("Java");
        strPair.printPair(); // Output: (Hello, Java)
    }
}