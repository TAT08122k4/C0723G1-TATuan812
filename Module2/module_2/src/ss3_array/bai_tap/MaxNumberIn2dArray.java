package ss3_array.bai_tap;

import java.util.Scanner;

public class MaxNumberIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Row of 2d Array:");
        int row = sc.nextInt();
        System.out.println("Input Col of 2d Array:");
        int col = sc.nextInt();
        double[][] matrix = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter Element in row %d and in col %d : ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        double max = matrix[0][0];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("Max Element is: ");
        System.out.print(max);
    }
}
