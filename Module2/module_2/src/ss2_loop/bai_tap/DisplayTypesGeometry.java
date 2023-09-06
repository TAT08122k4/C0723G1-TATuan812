package ss2_loop.bai_tap;

import java.util.Scanner;

public class DisplayTypesGeometry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Menu:\n" +
                    "   1.Print the rectangle \n" +
                    "   2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "   3.Print isosceles triangle\n" +
                    "   4.Exit");
            System.out.println("");
            System.out.println("Input Geometry u wanna print:");
             choice = Integer.parseInt(sc.nextLine());
        }while (choice < 0 || choice > 4);
        System.out.println("Enter Length of Geometry: ");
        int length = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                for (int i = 0;i < length;i++){
                    for (int j = 0; j < length * 3 ; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for (int i = 0; i < length;i++){
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                for (int i = length; i > 0;i--){
                    for (int j = 0; j <length; j++) {
                        if (i > j){
                            System.out.print(" ");
                        }else {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = length; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                for (int i = length; i > 0; i--) {
                    for (int j = length; j > 0 ; j--) {
                        if (j > i){
                            System.out.print(" ");
                        }else {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for (int i = 1;i < length;i++){
                    for (int j = 1; j < length - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                break;
        }
    }



}
