package ss3_array.bai_tap;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfMatrix = sc.nextInt();
        int[][] matrix = new int[lengthOfMatrix][lengthOfMatrix];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.println("Enter Element in Row " + i + "And Col" + j + "is: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal Line of Matrix is: " + sum);
    }
}
