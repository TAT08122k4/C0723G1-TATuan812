package ss4_class_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = sc.nextDouble();
        System.out.println("Enter B:");
        double b = sc.nextDouble();
        System.out.println("Enter C:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(a != 0){
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());

        }else {
            System.out.println("Plzz enter a number other than 0");
        }

    }
}
