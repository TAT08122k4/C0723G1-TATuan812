package ss7_abstract_class_interface.thuc_hanh.comparable.geometric;

import ss6_inheritance.thuc_hanh.shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color , Boolean filled , double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with " +
                " radius=" + radius +
                "Which is a subclass of " + super.toString();
    }
}
