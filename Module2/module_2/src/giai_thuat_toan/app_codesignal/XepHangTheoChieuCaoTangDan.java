package giai_thuat_toan.app_codesignal;

public class XepHangTheoChieuCaoTangDan {
    //    int [] solution(int [] a){
//        int count = 0;
//        int firstIntree =0;
//        int max = 0;
//        for (int i = 0; i < a.length ; i++) {
//            if (a[i] == -1){
//                count++;
//                if (count == 2){
//                    for (int j = firstIntree; j < i; j++) {
//                        max = a[j];
//                        for (int k = j; k < i; k++) {
//                            if (max < a[k]){
//                                a[k] = max;
//                            }
//                        }
//                    }
//                }
//            }
//            firstIntree = a[i];
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        XepHangTheoChieuCaoTangDan xepHangTheoChieuCaoTangDan = new XepHangTheoChieuCaoTangDan();
//        int [] a = {-1,150,190,170,-1,-1,160,180};
//        System.out.println(xepHangTheoChieuCaoTangDan.solution(a));
//    }
    int[] solution(int[] a) {
        if (a.length == 0) {
            return a;
        }
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                continue;
            }
            for (int j = i; j < a.length; j++) {
                if (a[j] == -1){
                    continue;
                }
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        XepHangTheoChieuCaoTangDan xepHangTheoChieuCaoTangDan = new XepHangTheoChieuCaoTangDan();
        int[] b = xepHangTheoChieuCaoTangDan.solution(a);
        for (int c : b) {
            System.out.println(c);
        }
    }
}
//     if (a.length == 0) {
//             return a;
//             }
//             int m = 0;
//             int t = 0;
//             for (int i = 0; i < a.length; i++) {
//        m = a[i];
//        if (m == -1) {
//        continue;
//        } else {
//        for (int j = i; j < a.length; j++) {
//        if (a[j] == -1) {
//        continue;
//        }
//        if (m > a[j]) {
//        t = m;
//        m = a[j];
//        a[j] = t;
//        }
//        }
//        }
//
//        a[i] = m;
//        }
//        return a;

