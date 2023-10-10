package thi_module2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String x2 = Integer.toString(x);
        System.out.println(x2);
        System.out.println(x2.charAt(0));
        if (x2.equals(x)){
            System.out.println("uk");
        }
    }
}
