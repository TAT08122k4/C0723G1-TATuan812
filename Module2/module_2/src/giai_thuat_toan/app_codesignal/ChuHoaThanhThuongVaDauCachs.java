package giai_thuat_toan.app_codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChuHoaThanhThuongVaDauCachs {
    public static String solution(String s) {
        String[] a = s.split("");
        String b = a[0].toLowerCase() + "";
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i].toUpperCase()) {
                b += " " + a[i].toLowerCase();
            } else {
                b += a[i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(solution("dS dwDW "));

    }
}
