package ss13_thuat_toan_sap_xep.bai_tap.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static void sortInsertion(int[] arr) { // cho cái mảng {5,3,7,6,2,1,10,0}
        int x;
        int pos;
        int temp;
        // cho vòng lặp chạy từ phần tử thứ hai trog mảng là số 3
        for (int i = 1; i < arr.length; i++) {
            // gán x cho phần tử tại vị trí i
            x = arr[i];
            // gán pos là index của 1 phần tử trog arr
            pos = i;
            // thoả mản đk thì hoán đổi vị trí element , so sánh các phần tuwr liền kè nhau và đổi chỗ
            while (pos > 0 && x < arr[i - 1]){
             arr[pos] = arr[pos - 1];
             // sau khi gán phần tử ở trước = phần tử ở sau thì giảm pos xuống;
             pos--;
            }
            // sau khi giảm pos gán lại ở vị pos hiện tại = i - 1 lại cho x , x là arr[i];
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr = {5,3,7,6,2,1,10,0};
        sortInsertion(arr);

    }
}
