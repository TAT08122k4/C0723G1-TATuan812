package giai_thuat_toan.app_codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }

    static int solution(int[] statues) {
        int max = statues[0];
        int min = statues[0];
        for (int i = 1; i < statues.length; i++) {
            if (max < statues[i]) {
                max = statues[i];
            }
            if (min > statues[i]) {
                min = statues[i];
            }
        }
        int count = 0;
        boolean flag 
        for (int i = 0; i < statues.length; i++) {
            for (int j = min; j < max; j++) {
                if (statues[i] != j) {
                    count++;
                    min++;
                    continue;
                }
            }
        }
        return count;
    }
}
