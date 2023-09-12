package ss6_inheritance.bai_tap.point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(3,6);
        point.setXY(7,8);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1,2,5,6);
        System.out.println(movablePoint.move());
        System.out.println(point);
    }
}
