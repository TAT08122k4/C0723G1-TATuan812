package giai_thuat_toan.app_codesignal;

import java.util.Scanner;

public class M2T2 {
    static boolean solution(int[] a) {
        int sum1 = 0;
        int sum2 = 0;
        if (a.length == 0) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                sum1 += a[i];
                for (int j = i; j < a.length; j++) {
                    sum2 += a[j];
                }
                if (sum1 == sum2) {
                    return true;
                }
                sum2 = 0;
            }
        }
        return false;
    }
        public static void main(String [] args){
            int[] arr = {1, 2, 3,3};
            System.out.println(solution(arr));
        }

}
