package ss3_array.bai_tap;

import java.util.Scanner;

public class SumInCol {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Col u wanna calc sum: ");
        int colSum = sc.nextInt();
        int sumCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (colSum == j) {
                    sumCol += matrix[i][colSum];
                }
            }
        }
        System.out.println("Sum of Col " + colSum + " Is : " + sumCol);

    }
}
