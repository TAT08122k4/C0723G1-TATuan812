package ss13_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 1, 8};
        int temp;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
        flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
