package ss1_introdution_java.bai_tap;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        System.out.print("Enter Your Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("Your Name Is " + name);
    }
}
