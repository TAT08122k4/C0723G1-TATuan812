package ss7_abstract_class_interface.thuc_hanh.comparator.geometric;

import ss6_inheritance.thuc_hanh.shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                " width=" + width +
                " and length=" + length +
                ", Which is a subclass of " + super.toString();
    }
}
