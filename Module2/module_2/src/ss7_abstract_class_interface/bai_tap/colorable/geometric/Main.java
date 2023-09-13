package ss7_abstract_class_interface.bai_tap.colorable.geometric;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.howToColor();

        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(8);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(5);

        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof IColorable){
                ((IColorable) shape).howToColor();
            }
        }
    }
}
