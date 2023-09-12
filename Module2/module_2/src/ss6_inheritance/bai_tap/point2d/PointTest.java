package ss6_inheritance.bai_tap.point2d;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(4,3,2);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
