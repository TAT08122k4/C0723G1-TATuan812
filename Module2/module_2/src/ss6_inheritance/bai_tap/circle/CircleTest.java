package ss6_inheritance.bai_tap.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4.5);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5.6);
        System.out.println(cylinder.getVolumeOfACircularCylinder());
        Circle circle2 =  new Cylinder();
        System.out.println(circle2);
    }
}
