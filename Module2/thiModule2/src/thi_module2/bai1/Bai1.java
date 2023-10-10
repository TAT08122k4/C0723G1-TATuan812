package thi_module2.bai1;

public class Bai1 {
    public static void main(String[] args) {
        int [] arr = {-4,-2};
        System.out.println(checkArray(arr));
    }
    static boolean checkArray(int [] arr){
        boolean flag = false;
        int hold = 0;
        int hold2 = 0;
        for (int i = 0; i < arr.length -1 ;  i++) {
            hold = arr[i + 1] - arr[i];l
            for (int j = 0; j < arr.length -1; j++) {
                hold2 = arr[j + 1] - arr[j];
                if (hold == hold2) {
                    flag = true;
                } else {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
}
