import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bán kính hình tròn là: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Diện tích của hình tròn là: " + circle.getArea(radius));
    }
}
