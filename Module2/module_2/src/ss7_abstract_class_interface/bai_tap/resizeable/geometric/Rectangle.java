package ss7_abstract_class_interface.bai_tap.resizeable.geometric;


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

    @Override
    public void resize(double percent) {
      setWidth(getWidth() + (getWidth() * 100) / 100);
      setLength(getLength() + (getLength() * 100) / 100);
        System.out.println("New Area is " + getArea());
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
                "Area is " + getArea() +
                ", Which is a subclass of " + super.toString();
    }
}
