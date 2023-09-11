package ss4_class_object.bai_tap.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getDiscriminant() {
        double delta;
        return delta = b * b - 4 * a * c;
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public double getRoot1() {
        return (-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt((b * b - 4 * a * c))) / (2 * a);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
