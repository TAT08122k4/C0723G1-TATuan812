package giai_thuat_toan.app_codesignal;

public class CapLienKeLonNhat {
    static int solution(int [] inputArray){
        int max = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            if (max < inputArray[i] * inputArray[i+1]){
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {3,6,-2,-5,7,3};
        System.out.println(solution(arr));
    }
}
