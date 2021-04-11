public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(3,4);
        Cylinder cylinder = new Cylinder(4,5);
        Rectangular rectangular = new Rectangular(4,5,6);
        System.out.println(rectangular.getHeight());
        System.out.println(cylinder.getHeight());
        circle.setRadius(5);
        circle.display();
        rectangle.display();
        rectangular.display();
        cylinder.display();

    }
}
