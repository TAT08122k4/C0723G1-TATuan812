package ss7_abstract_class_interface.bai_tap.resizeable.geometric;


public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        setRadius((getRadius() + (getRadius() * percent) / 100));
        System.out.println("New Area is " + getArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                " radius=" + radius +
                " Area is : " + getArea() +
                "Which is a subclass of " + super.toString();
    }
}
