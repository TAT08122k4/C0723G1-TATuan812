package ss4_class_object.bai_tap.watch;

public class TestStopWatch {
    public static void main(String[] args) {
        Watch watch = new Watch();
        int[] arr = new int[30000];
        double randomNum;
        for (int i = 0; i < arr.length; i++) {
             randomNum = Math.random() * 1000000;
            arr[i] = (int) randomNum;
        }
        watch.start();
        TestStopWatch arrTest = new TestStopWatch();
        arrTest.sort(arr);
        watch.stop();
        System.out.println("Time to Run is : " + "\t" + watch.getElapsedTime() + "ms");
    }

    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
