package giai_thuat_toan.app_codesignal;

import java.util.ArrayList;

public class demSoLanXuatHienCuaKiTu
{
    public static void main(String[] args) {
        String randomString = "aabacsdc";
        int count;
        char a;
        for (int i = 0; i < randomString.length() ; i++) {
            a = randomString.charAt(i);
            count = 0;
            for (int j = i; j < randomString.length() ; j++) {
                if (a == randomString.charAt(j)){
                    count++;
                }
            }
            if (!(randomString.charAt(i) == '!')){
                System.out.println(count + " " + String.valueOf(a) + " ");
            }
            randomString =  randomString.replace(randomString.charAt(i) , '!');
        }
    }
}
