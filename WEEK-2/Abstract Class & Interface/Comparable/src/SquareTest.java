public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3);
        System.out.println(square);

        square = new Square(6, "gray", false);
        System.out.println(square);
    }
}
