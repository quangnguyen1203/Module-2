public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle = new Circle(5);
        System.out.println(circle);

        circle = new Circle(6,"yellow");
        System.out.println(circle);
    }
}
