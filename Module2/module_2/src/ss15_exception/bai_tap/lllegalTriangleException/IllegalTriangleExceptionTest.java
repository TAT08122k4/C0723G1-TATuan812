package ss15_exception.bai_tap.lllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleExceptionTest extends Exception {
     static Scanner sc = new Scanner(System.in);
    public static boolean checkTriangle(double a, double b, double c) {
            try {
                if (a + c <= b || a + b <= c || b + c <= a) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.err.println("Nhập Cạnh > 0 và 2 cạnh cộng lại phải lớn hơn cạnh còn lại");
                return false;
            }
            return true;
    }
    public static boolean checkEdge(double num) {
        try {
            if (num <= 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.err.println("Nhập Cạnh > 0");
            return false;
        }
        return true;
    }
    public static double inputEdge( String edge){
        double num= 0;
        do {
            System.out.println("Nhập Cạnh " + edge);
            num = Double.parseDouble(sc.nextLine());
            if (checkEdge(num)){
                break;
            }
        } while (true);
        return num;
    }
}
