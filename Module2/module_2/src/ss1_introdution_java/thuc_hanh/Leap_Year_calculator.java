package ss1_introdution_java.thuc_hanh;

import java.util.Scanner;

public class Leap_Year_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d Là Năm Nhuận", year);
                } else {
                    System.out.printf("%d ko phải Năm Nhuận", year);
                }
            } else {
                System.out.printf("%d Là Năm Nhuận", year);
            }
        }else {
            System.out.printf("%d Ko phải năm nhuận",year);
        }
    }
}
