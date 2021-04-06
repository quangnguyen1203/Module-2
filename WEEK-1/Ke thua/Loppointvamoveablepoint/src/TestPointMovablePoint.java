import java.util.Arrays;

public class TestPointMovablePoint {
    public static void main(String[] args) {
        Point point = new Point(2, 3);

        System.out.println(Arrays.toString(point.getXY()));

        MovablePoint movablePoint = new MovablePoint(4.4f, 3, 2, 1);

        System.out.println(movablePoint.toString());
        
        movablePoint.setXY(4.5f,2.8f);

        System.out.println(movablePoint.toString());

        System.out.println(movablePoint.move());

        System.out.println(Arrays.toString(point.getXY()));
    }

}