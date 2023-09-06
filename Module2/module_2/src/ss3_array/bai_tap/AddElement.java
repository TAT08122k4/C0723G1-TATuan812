package ss3_array.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0};
        System.out.println("Input Number U Wanna Push In Array");
        int newElement = sc.nextInt();
        System.out.println("Input Index u wanna push:");
        int newIndex = sc.nextInt();
        for (int i = newElement; i < arr.length; i++) {
                int temp = arr[i];
                int temp2 = arr[i + 1];
                arr[i] = newElement;
                arr[i + 1] = temp;
                arr[i + 2] = temp2;
                i++;
            }
        System.out.println("Arr after Add New Element: ");
        for (int arr1: arr) {
            System.out.println(arr1);

        }
    }
}
