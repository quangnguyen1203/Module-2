import java.util.Arrays;

public class Test2DAnd3D {
    public static void main(String[] args) {


        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
