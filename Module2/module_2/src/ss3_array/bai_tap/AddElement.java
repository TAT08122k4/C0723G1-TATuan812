package ss3_array.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Input Number U Wanna Push In Array");
        int newElement = sc.nextInt();
        System.out.println("Input Index u wanna push:");
        int newIndex = sc.nextInt();
        int[] arrAfterAdd = new int[arr.length + 1];
        for (int i = 0; i < arrAfterAdd.length; i++) {
            if (newIndex == i){
                arrAfterAdd[i] = newElement;
            }else {
                arrAfterAdd[i] = arr[i];
            }

        }
        for (int newArr : arrAfterAdd){
            System.out.println(newArr);
        }

    }
}
