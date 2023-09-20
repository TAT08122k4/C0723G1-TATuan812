package ss12_thuat_toan_sap_xep.bai_tap;

import java.util.*;

public class StringConsecutively {
//    static List checkStringConsecutivelyMax(String str) {
//      ArrayList maxArr = new ArrayList();
//      ArrayList tempArr = new ArrayList();
//        for (int h = 0; h < str.length()-1; h++) {
//            for (int i = h + 1; i < str.length() - 1; i++) {
//                if (str.charAt(i) < str.charAt(i+1)){
//                    tempArr.add(str.charAt(i));
//                }else {
//                    break;
//                }
//            }
//            if (maxArr.size() == 0){
//                maxArr = tempArr;
//            }
//            if (maxArr.size() <= tempArr.size()){
//                maxArr.clear();
//                maxArr = tempArr;
//                tempArr.clear();
//            }
//        }
//        return maxArr;
//    }

    public static void main(String[] args) {
        // bài này e tham khảo <3;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
