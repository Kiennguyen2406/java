public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);


        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        square = new Square(555, "yellow", true);
        System.out.println(square);
    }

}
