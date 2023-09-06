package ss3_array.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Length of array");
        int lengthOfArr = sc.nextInt();
        int[] arr = new int[lengthOfArr];
        for (int i = 0; i < lengthOfArr; i++) {
            System.out.println("Input Element in " + i + "Index");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input element u wanna delete:");
        int deleteElement = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteElement) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int arrAfterDelete : arr) {
            System.out.println(arrAfterDelete);
        }
    }
}
