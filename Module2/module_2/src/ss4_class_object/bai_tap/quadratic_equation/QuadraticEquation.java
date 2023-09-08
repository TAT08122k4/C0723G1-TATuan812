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
    public QuadraticEquation(){

    }

    public double getDiscriminant() {
        double delta;
        return delta = b * b - 4 * a * c;
    }
    public double getRoot(){
        return -b / (2 * a);
    }

    public double getRoot1() {
        if (getDiscriminant() > 0) {
            System.out.println("Equation has 2 solutions");
            return (-b + Math.sqrt((b * b - 4 * a * c))) / 2 * a;
        } else if (getDiscriminant() == 0){
            System.out.println("Equation has a double solution");
            return getRoot();
        }else {
            System.out.println("The equation has no roots");
            return 0;
        }
    }
    public double getRoot2() {
        if (getDiscriminant() > 0) {
            System.out.println("Equation has 2 solutions");
            return (-b - Math.sqrt((b * b - 4 * a * c))) / 2 * a;
        } else if (getDiscriminant() == 0){
            System.out.println("Equation has a double solution");
            return getRoot();
        }else {
            System.out.println("The equation has no roots");
            return 0;
        }
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
