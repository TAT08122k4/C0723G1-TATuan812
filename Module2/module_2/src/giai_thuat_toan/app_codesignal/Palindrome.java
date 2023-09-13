package giai_thuat_toan.app_codesignal;

import ss7_abstract_class_interface.bai_tap.colorable.geometric.Shape;

public class Palindrome {
    static boolean solution(String inputString){
        int tempLength = inputString.length() -1;

        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) == inputString.charAt(tempLength)){
                tempLength--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solution("aabac"));
    }
}
