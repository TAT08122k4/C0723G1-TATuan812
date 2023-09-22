package ss15_exception.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập x: ");
        int x = sc.nextInt();
        System.out.println("hãy nhập y: ");
        int y = sc.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);

    }
    private void calculate(int x , int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Tổng x - y = " + b);
            System.out.println("Tổng x * y = " + c);
            System.out.println("Tổng x / y = " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " +  e.getMessage());
        }
    }
}
