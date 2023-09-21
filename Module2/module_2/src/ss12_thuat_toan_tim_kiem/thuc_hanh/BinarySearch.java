package ss12_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int binarySearch(int[] list, int x) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (x < list[mid]) {
                high = mid - 1;
            } else if (x == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] list ={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list,50));
        System.out.println(binarySearch(list,67));
    }
}
