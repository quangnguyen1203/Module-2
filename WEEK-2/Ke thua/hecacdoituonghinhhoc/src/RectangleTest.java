public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.7,3.2);
        System.out.println(rectangle);

        rectangle = new Rectangle(7.2,4.1,"blue", true);
        System.out.println(rectangle);
    }
}
