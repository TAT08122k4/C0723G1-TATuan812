package ss7_abstract_class_interface.bai_tap.resizeable.resizeabletest;

import ss7_abstract_class_interface.bai_tap.resizeable.geometric.Circle;
import ss7_abstract_class_interface.bai_tap.resizeable.geometric.Rectangle;
import ss7_abstract_class_interface.bai_tap.resizeable.geometric.Shape;
import ss7_abstract_class_interface.bai_tap.resizeable.geometric.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", false, 3.5);
        shapes[1] = new Rectangle(6, 12);
        shapes[2] = new Square(8, "Blue", false);
        System.out.println("Shapes");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
        System.out.println("Shapes after resizeable: ");
        for (Shape shape : shapes){
            shape.resize(Math.random() * 100);
            System.out.println(shape);
        }

    }
}
