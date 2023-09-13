package ss7_abstract_class_interface.bai_tap.resizeable.geometric;


public class Square extends Shape {
    private double side = 1.0;

    public Square() {

    }

    public Square(String color, Boolean filled) {
        super(color, filled);
    }

    public Square(double side, String color, Boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide() * percent) / 100);
    }

    @Override
    public String toString() {
        return " A Square with side=" + getSide() + "Area is : " + getArea() +  ", which is a subclass of " + super.toString();
    }
}
