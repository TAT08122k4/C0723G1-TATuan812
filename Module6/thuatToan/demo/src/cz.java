
import java.util.ArrayList;

public class cz {
    public static boolean kiemTraMangCoTinhChatLe(int a [] ){
        boolean flag = true;
        int tong1 = 0;
        int tong2 = 0;
        for (int i = 0; i < a.length; i++) {
         tong1 = a[i] + a[i +1];
         tong2 = a[i + 2] + a[i + 3];
         if (i + 3 >= a.length){
             return flag;
         }else {
             if (tong1 % 2 == 0 && tong2 % 2 == 0){
                 flag = false;
             }else {
                 return flag = true;
             }
         }

        }
        return flag;



    }
    public static void main(String[] args) {
     int arr [] = {1,2,2,4,5};
        System.out.println(kiemTraMangCoTinhChatLe(arr));


    }
}
