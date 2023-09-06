package ss3_array.bai_tap;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] mergeArr = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            mergeArr[i] = arr[i];
        }
        int count = 0;
        for (int i = arr.length; i < mergeArr.length; i++) {
            mergeArr[i] = arr2[count];
            count++;
        }
        for (int arrAfterMerge : mergeArr) {
            System.out.println(arrAfterMerge);
        }
    }
}
