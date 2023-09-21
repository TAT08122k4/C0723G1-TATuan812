package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTreeSearch {
    static int binarySearch(int[] arr, int left, int right, int value) {
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            }
            if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 32, 2, 7, 2, 1, 99, 31, 88};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Value bạn cần tìm kiếm trong mảng");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("Array before sort:");
        for (int arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        Arrays.sort(arr);
        System.out.println("");
        System.out.println("Array after sort:");
        for (int arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        System.out.println("");
        System.out.println(binarySearch(arr, 0, arr.length - 1, value));
    }
}