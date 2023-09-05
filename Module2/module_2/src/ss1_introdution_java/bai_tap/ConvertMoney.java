package ss1_introdution_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ur USD");
        double usd = sc.nextDouble();
        double vnd = usd * RATE;
        System.out.printf("%f USD To VND is %d ",usd,vnd);
    }
}
