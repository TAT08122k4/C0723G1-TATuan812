package ss15_exception.bai_tap.lllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleExceptionTest extends Exception {
    static Scanner sc = new Scanner(System.in);
    static boolean checkTriangle(double a, double b, double c) {
            try {
                if (a <= 0 || b <= 0 || c <= 0 || a + c <= b || a + b <= c || b + c <= a) {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.err.println("Nhập Cạnh > 0 và 2 cạnh cộng lại phải lớn hơn cạnh còn lại");
                return false;
            }
            return true;
    }
}
