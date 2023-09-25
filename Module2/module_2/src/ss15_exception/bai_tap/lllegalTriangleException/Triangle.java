package ss15_exception.bai_tap.lllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        Triangle triangle = new Triangle();
        do {
            a = IllegalTriangleExceptionTest.inputEdge("a");
            b = IllegalTriangleExceptionTest.inputEdge("b");
            c = IllegalTriangleExceptionTest.inputEdge("c");
            if (IllegalTriangleExceptionTest.checkTriangle(a, b, c)) {
                triangle.setA(a);
                triangle.setB(b);
                triangle.setC(c);
                System.out.println(triangle.toString());
                break;
            }
        } while (true);
    }
}
