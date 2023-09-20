package ss12_thuat_toan_sap_xep.bai_tap;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StringSortUp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str  = input.nextLine();
        ArrayList<Character> maxString = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Character> arrList = new ArrayList<>();
            arrList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > arrList.get(arrList.size()-1)) {
                    arrList.add(str.charAt(j));
                }
            }
            if (arrList.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(arrList);
            }
            arrList.clear();
        }

        for (Character char1 : maxString) {
            System.out.print(char1);
        }
        System.out.println();
    }
}
