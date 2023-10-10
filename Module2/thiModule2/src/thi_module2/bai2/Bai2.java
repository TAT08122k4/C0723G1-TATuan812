package thi_module2.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập vào số n có 4 chữ số");
                int n = Integer.parseInt(sc.nextLine());
                System.out.println(findMaxNumber(n));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        }while (true);

    }

    static int findMaxNumber(int x) {
        String x2 = Integer.toString(x);
        String maxNum ="";
        int maxValue = 0;
        int maxValue2 = 0;
        if (x < 999) {
            return -1;
        } else if (x > 9999) {
            return -1;
        } else {
            for (int i = 0; i < x2.length() ; i++) {
                maxValue = Integer.parseInt(String.valueOf(x2.charAt(i))) ;
                for (int j = i; j < x2.length() -1 ; j++) {
                    maxValue2 = Integer.parseInt(String.valueOf(x2.charAt(j + 1)));
                    if (maxValue < maxValue2 ){
                        maxValue = maxValue2;
                        i++;
                        break;
                    }
                }
                if (maxNum.length() == 3){
                    break;
                }else {
                    maxNum += maxValue;
                }
            }
        }
        return Integer.parseInt(maxNum);
    }
}
