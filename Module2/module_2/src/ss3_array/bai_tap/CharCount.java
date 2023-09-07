package ss3_array.bai_tap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringramdom = "swedasagwaszx";
        System.out.println("Enter a character u wanna check: ");
        char checkChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < stringramdom.length(); i++) {
            if (stringramdom.charAt(i) == checkChar) {
                count++;
            }
        }
        System.out.printf("Số Kí Tự %s Xuất Hiện Trong Chuỗi Là %d",checkChar,count);
    }
}
