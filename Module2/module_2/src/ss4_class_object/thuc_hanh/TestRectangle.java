package ss4_class_object.thuc_hanh;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width: ");
        int width = sc.nextInt();
        System.out.println("Enter Height:");
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \t" + rectangle);
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
