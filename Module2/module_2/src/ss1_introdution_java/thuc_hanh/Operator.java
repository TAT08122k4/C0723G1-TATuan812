package ss1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width:");
        width = sc.nextFloat();
        System.out.print("Enter Height:");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
