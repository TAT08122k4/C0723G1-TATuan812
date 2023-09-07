package ss3_array.bai_tap;

import javax.management.StandardEmitterMBean;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Input Number U Wanna Push In Array");
        int newElement = sc.nextInt();
        System.out.println("Input Index u wanna push:");
        int newIndex = sc.nextInt();
        System.out.println("Array: ");
        for (int firstArr : arr){
            System.out.print(firstArr + "\t");
        }
        System.out.println(" ");
        int[] arrAfterAdd = new int[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arrAfterAdd.length; i++) {
            if(count < arr.length){
                if (newIndex == i){
                    arrAfterAdd[i + 1] = arr[i];
                    arrAfterAdd[i] = newElement;
                    i++;
                }else {
                    arrAfterAdd[i] = arr[count];
                }
            }
            count++;
        }
        for (int newArr : arrAfterAdd){
            System.out.printf(newArr + "\t");
        }

    }
}
