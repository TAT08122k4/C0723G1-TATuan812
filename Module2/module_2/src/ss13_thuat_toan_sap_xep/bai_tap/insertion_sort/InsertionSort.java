package ss13_thuat_toan_sap_xep.bai_tap.insertion_sort;

import java.util.Arrays;
import java.util.Map;

public class InsertionSort {// cho tham số {5,3,7,6,2,1,10,0}
    static void sortInsertion(int[] arr) {
        int x;
        int pos;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Gán x cho phần tử thứ " + i + "Của mảng arr" + " và gán pos cho vị trí của phần tử trog mảng");
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[i - 1]){
                System.out.println("Gán giá trị của phần tử tại vị trí " + (pos - 1)  + " cho phần tử tại vị trí " + pos);
             arr[pos] = arr[pos - 1];
             pos--;
            }
            System.out.println("Gán giá trị tại vị trí " + pos + " với phần tử là " + x);
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {5,3,7,6,2,1,10,0};
        sortInsertion(arr);

    }
}
