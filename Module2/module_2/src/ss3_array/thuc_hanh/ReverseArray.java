package ss3_array.thuc_hanh;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Array" + "\t");
        for (int arr1 : arr) {
            System.out.print(arr1 + "\t");
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Array after reverse:");
        for (int arr2 : arr) {
            System.out.println(arr2);
        }
    }
}
